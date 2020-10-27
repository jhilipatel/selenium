/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author soura
 *
 */

//This class will store all the locator or method of login page
public class LoginPage
{
    WebDriver driver;
	
	By username = By.name("username");
	By password = By.name("pwd");
	By rememberme = By.name("remember");
	By login = By.xpath("//div[.='Login ']");
	By forgotpassword = By.xpath("//a[contains(text(),'Forgot')]");
	By actitimeinc = By.xpath("//a[.='actiTIME Inc.']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void typeusername()
	{
		driver.findElement(username).sendKeys("admin");;
	}
	public void typepassword()
	{
		driver.findElement(password).sendKeys("manager");;
	}
	public void clickrememberme()
	{
		driver.findElement(rememberme).click();;
	}
	public void clicklogin()
	{
		driver.findElement(login).click();;
	}
}
