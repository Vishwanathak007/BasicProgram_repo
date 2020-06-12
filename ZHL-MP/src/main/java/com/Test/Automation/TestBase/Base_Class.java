package com.Test.Automation.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.Test.Automation.Utitlity.Util;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class 
{
	public Properties PRO;
	public WebDriver driver;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	public Logger logger;
	
	public Base_Class() throws Exception
	{
		String Properties_Path = "./src/main/java/com/Test/Automation/Configuration/Config.Properties";
		File f = new File(Properties_Path);
		FileInputStream FIS = new FileInputStream(f);
		PRO = new Properties();
		PRO.load(FIS);
		logger = Logger.getLogger("com.Test.Automation.TestBase.Base_Class");
		PropertyConfigurator.configure("./src/main/java/com/Test/Automation/Configuration/Config.Properties");
	}
	
	public void invoke_browser(String BrowserName)
	{
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-notifications","incognito","start-maximized");
			logger.info("<<<<<<<<<<<<<<----------Opening Chrome Browser--------------->>>>>>>>>>>");
			driver = new ChromeDriver(options);
		}
		else if(BrowserName.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		logger.info("<<<<<<<<<<<<<<----------Entering the URL");
		driver.get(PRO.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Util.implicitlyWait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Util.pageLoadTimeout, TimeUnit.SECONDS);
	}	
	
	public void input(WebElement ele, String keysToSend)
	{
		ele.sendKeys(keysToSend);
	}
	
	public void select(WebElement element, String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void click(WebElement ele)
	{
		ele.click();
	}
	
	public void alert_handle()
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void verify_alert_mesage(String expected_msg)
	{
		String actual_msg = driver.switchTo().alert().getText();
		Assert.assertEquals(actual_msg, expected_msg);
	}
	
	public void window_handle()
	{
		String parent_ID = driver.getWindowHandle();
		Set<String> All_ID = driver.getWindowHandles();
		
		for(String chid_id : All_ID)
		{
			if(!(chid_id.equalsIgnoreCase(parent_ID)))
			{
				driver.switchTo().window(chid_id);
				driver.close();
			}
		}
		driver.switchTo().defaultContent();
	}
	
	public String getDate()
	{
		SimpleDateFormat SDF = new SimpleDateFormat("dd-MMM-YYYY hh-mm-ss -a");
		String date = SDF.format(new Date());
		return date;
	}
	
	public String Capture_Screenshot(WebDriver driver, String Sub_Folder_Name, String Image_Name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String destination_path = System.getProperty("user.dir") + "/Screenshot/" +Sub_Folder_Name + "/" + Image_Name + "_" + getDate()+".png";
		File destFile = new File(destination_path);
		FileUtils.copyFile(src, destFile);
		return destination_path;
	}
	
	public Object[][] Read_Excel(String Sheet_Name) throws Exception, IOException
	{
		File file = new File(PRO.getProperty("Excel_Path"));
		FileInputStream FIS = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(FIS);
		XSSFSheet sheet = wb.getSheet(Sheet_Name);
	
		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rows][columns - 1];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns - 1; j++)
			{
				data[i][j] = sheet.getRow(i + 1).getCell(j + 1).toString();
			}
		}
		wb.close();
		return data;
	}
	
	public void verify_message(String xpathExpression, String expected_text)
	{
		logger.info("<<<<<<<<<<<<<<----------Getting the text from the validation message--------------->>>>>>>>>>>");
		String actual_text = driver.findElement(By.xpath(xpathExpression)).getText();
		logger.info("<<<<<<<<<<<<<<----------Comparing the actual message with expected message--------------->>>>>>>>>>>");
		Assert.assertEquals(actual_text, expected_text);
	}
	
	public void mouse_over(WebElement target_element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(target_element).build().perform();;
	}
	
	public void drag_n_drop(WebElement source, WebElement target)
	{
		Actions act = new Actions(driver);
		act.clickAndHold().dragAndDrop(source, target).build().perform();
	}
	
	@BeforeSuite
	public void report_generation()
	{
		String Reort_Path = PRO.getProperty("ReportPath")+getDate()+".html";
		File file = new File(Reort_Path);
		reporter = new ExtentHtmlReporter(file);
		reports = new ExtentReports();
		reports.attachReporter(reporter);
	}
	
	@AfterSuite
	public void report_flush()
	{
		reports.flush();
	}
}
