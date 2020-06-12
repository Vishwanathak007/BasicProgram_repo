package cookie_Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.StringTokenizer;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookie_Test
{
	static WebDriver driver;
	public static void main(String[] args) throws IOException, ParseException
	{
		
        System.setProperty("webdriver.chrome.driver","E:\\Ujjwal\\chromedriver.exe");					
		driver=new ChromeDriver();   
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
		       				
        // Input Email id and Password If you are already Register		
        driver.findElement(By.name("username")).sendKeys("abc123");							
        driver.findElement(By.name("password")).sendKeys("123xyz");							
        driver.findElement(By.name("submit")).click();	
        
        write_cookie();
        read_cookies_file();
	}
	
	public static void write_cookie() throws IOException
    {
		Set<Cookie> cookie = driver.manage().getCookies(); 
		File f = new File("cookies.data");
		f.delete();
		f.createNewFile();
        FileWriter FW = new FileWriter(f);
        BufferedWriter BW = new BufferedWriter(FW);
       
        for(Cookie ck : cookie)
        {
        	BW.write(ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure());
        	BW.newLine();
        }
        BW.close();
        FW.close();
    }
	
	public static void read_cookies_file() throws IOException, ParseException
	{
		File f = new File("cookies.data");
		FileReader FR = new FileReader(f);
		BufferedReader BR = new BufferedReader(FR);
		String strline;
		while((strline = BR.readLine())!=null)
		{
			StringTokenizer ST = new StringTokenizer(strline, ";");
			while(ST.hasMoreTokens())
			{
				String cookie_Name = ST.nextToken();
				String cookie_value = ST.nextToken();
				String cookie_domain = ST.nextToken();
				String cookie_path = ST.nextToken();
				String val = ST.nextToken();
				Date cookie_expiry_date = null;
				if(!(val.equalsIgnoreCase("null")))
				{
					SimpleDateFormat SDF = new SimpleDateFormat("EEE MMM dd hh:mm:ss ZZZ YYYY");
					cookie_expiry_date = SDF.parse(val);
				}		
				boolean isSecure = new Boolean(ST.nextToken()).booleanValue();
				
				Cookie ck = new Cookie(cookie_Name, cookie_value, cookie_domain, cookie_path, cookie_expiry_date, isSecure);
				System.out.println(ck);
				driver.manage().addCookie(ck);
			}	
		}
		BR.close();
		FR.close();
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");	
		driver.navigate().refresh();
	}
}
