/**
 * 
 */
package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wordpress.Pages.LoginPage;

/**
 * @author soura
 *
 */
public class VerifyWordpresslogin 
{
   
	public void verifyvalidlogin()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage log=new LoginPage(driver);
		log.typeusername();
		log.typepassword();
		log.clicklogin();
		driver.quit();
		
	}
}
