package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OrangeHrmAssignment {

	public static void main(String[] args) 
	{
		
		/*
		 * System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://opensource-demo.orangehrmlive.com");
		 * driver.findElement(By.linkText("Forgot your password?")).click();
		 * driver.close();
		 */
		/*
		 * System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 * WebDriver driver = new FirefoxDriver(); driver.manage().window().maximize();
		 * driver.get("https://opensource-demo.orangehrmlive.com");
		 * driver.findElement(By.linkText("Forgot your password?")).click();
		 * driver.close();
		 */
		 
		/*
		 * System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		 * WebDriver driver = new EdgeDriver(); driver.manage().window().maximize();
		 * driver.get("https://opensource-demo.orangehrmlive.com");
		 * driver.findElement(By.linkText("Forgot your password?")).click();
		 * driver.close();
		 */
		 
		  System.setProperty("webdriver.ie.driver","D:/DRIVE PATH/IEDriverServer.exe");
		  WebDriver driver = new InternetExplorerDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com");
		  driver.findElement(By.linkText("Forgot your password?")).click();
		  driver.close();
		 
	}

}
