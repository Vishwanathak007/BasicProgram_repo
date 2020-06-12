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

public class Cookie_Testing 
{
	public static void main(String[] args) throws IOException, ParseException 
	{	
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver","E:\\Ujjwal\\chromedriver.exe");					
		driver=new ChromeDriver();   
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
		
       				
        // Input Email id and Password If you are already Register		
        driver.findElement(By.name("username")).sendKeys("abc123");							
        driver.findElement(By.name("password")).sendKeys("123xyz");							
        driver.findElement(By.name("submit")).click();					
        		
        // create file named Cookies to store Login Information		
        File file = new File("Cookies.data");							
        try		
        {	  
            // Delete old file if exists
			file.delete();		
            file.createNewFile();			
            FileWriter fileWrite = new FileWriter(file);							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
            // loop for getting the cookie information 		
            	
            // loop for getting the cookie information 	
            Set<Cookie> cookie = driver.manage().getCookies();
            for(Cookie ck : cookie)							
            {			
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
                Bwrite.newLine();             
            }			
            Bwrite.close();			
            fileWrite.close();	
            
        }
        catch(Exception ex)					
        {		
            ex.printStackTrace();			
        }
       
			File f =  new File("Cookies.data");
			FileReader FR = new FileReader(f);
			BufferedReader BR = new BufferedReader(FR);
			String strline;
			while((strline= BR.readLine())!=null)
			{
				StringTokenizer token = new StringTokenizer(strline, ";");
				while(token.hasMoreTokens())
				{	
			        String name = token.nextToken();					
			        String value = token.nextToken();					
			        String domain = token.nextToken();
			        String path = token.nextToken();
			        String val;
			        Date expiry_val = null;
			        if(!(val=token.nextToken()).equals("null"))
					{		
			        	SimpleDateFormat sdf=new SimpleDateFormat("EEE MMM dd hh:mm:ss zzz yyyy"); 
			       		expiry_val = sdf.parse(val);				
			        }		
			        
			        Boolean isSecure = new Boolean(token.nextToken()).booleanValue();
			
			        Cookie ck = new Cookie(name, value, domain, path, expiry_val, isSecure);
			        System.out.println(ck);
			        driver.manage().addCookie(ck); // This will add the stored cookie to your current session					
			    }		
			  }
			BR.close();
		
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");	
		driver.navigate().refresh();
  }
}	


