package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.actitime.com/login.do"); 
		  WebDriverWait wait = new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Forgot your password?")));
		  
		  driver.findElement(By.linkText("Forgot your password?")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.linkText("actiTIME Inc.")).click();
		  Thread.sleep(3000);
		  driver.manage().deleteAllCookies();
		  driver.close();
		
		  
		  

	}

}
