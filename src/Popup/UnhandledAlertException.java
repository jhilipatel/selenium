package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnhandledAlertException {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.id("container_tasks")).click();
        driver.findElement(By.xpath("//div[.='Add New']")).click();
        driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("Mukta");
       driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
        
		/*
		 * Alert alt = driver.switchTo().alert(); //alt.accept(); alt.dismiss();  //bcoz of this UnHandledAlertException
		 */
       driver.findElement(By.id("logoutLink")).click();
	}

}
