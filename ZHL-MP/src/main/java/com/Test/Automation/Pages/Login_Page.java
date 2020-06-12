package com.Test.Automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Test.Automation.TestBase.Base_Class;

public class Login_Page extends Base_Class
{
	public Login_Page(WebDriver driver) throws Exception 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ddlShift") WebElement Shift_Drop_Down;
	@FindBy(name =  "txtUserId") WebElement loginID;
	@FindBy(xpath = "//input[@type='password']")WebElement pwd;
	@FindBy(xpath = "//input[@type='submit']")WebElement login_button;
	
	public void login_to_app(String Shift_Drop_Down_Text, String UNAME, String Password, String Xpath, String Expected_Message) throws InterruptedException
	{
		logger.info("<<<<<<<<<<<<<<----------Selecting the value from the drop down--------------->>>>>>>>>>>");
		select(Shift_Drop_Down, Shift_Drop_Down_Text);
		logger.info("<<<<<<<<<<<<<<----------Entering the User Name--------------->>>>>>>>>>>");
		input(loginID, UNAME);
		logger.info("<<<<<<<<<<<<<<----------Entering the Pasword--------------->>>>>>>>>>>");
		input(pwd, Password);
		logger.info("<<<<<<<<<<<<<<----------Clicking on submit button--------------->>>>>>>>>>>");
		click(login_button);
		if((Shift_Drop_Down_Text.equalsIgnoreCase("select"))||(UNAME.equalsIgnoreCase(""))||(Password.equalsIgnoreCase("")))
 		{
			verify_alert_mesage(Expected_Message);
			logger.info("<<<<<<<<<<<<<<----------Clicking on Ok button in the Alert--------------->>>>>>>>>>>");
			alert_handle();
 		}
 		else
 		{
 			verify_message(Xpath,Expected_Message);
 		}
	}
}
