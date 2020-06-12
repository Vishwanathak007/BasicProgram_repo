package com.Test.Automation.TestCases;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.Test.Automation.Pages.Login_Page;
import com.Test.Automation.TestBase.Base_Class;

public class Login_Page_TC extends Base_Class
{
	Login_Page LP;
	
	public Login_Page_TC() throws Exception
	{
		super();
	}
	
	@BeforeMethod
 	@Parameters("browser_name")
 	public void browser_init(String browsername)
 	{
 		invoke_browser(browsername);
 	}
 	
 	@DataProvider
 	public Object[][] read_excel() throws IOException, Exception
 	{
 		Object[][] data = Read_Excel("Login_Page_Test_Data");
 		return data;
 	}
 	
 	@Test(dataProvider = "read_excel")
 	public void test_login_to_app(String Shift_Name, String Login_ID, String Password, String Actual_XPath, String Expected_Message) throws Exception
 	{
 		LP = new Login_Page(driver);
 		LP.login_to_app(Shift_Name, Login_ID, Password, Actual_XPath, Expected_Message);
 	}
 	
 	@AfterMethod
 	public void browser_close()
 	{
 		driver.close();
 	}
}
