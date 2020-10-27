package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		
		
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		  driver.get("https://demo.actitime.com/login.do"); Thread.sleep(1000);
		  driver.findElement(By.name("username")).sendKeys("Jhili");
		  driver.findElement(By.name("pwd")).sendKeys("Qspiders"); Thread.sleep(3000);
		  driver.findElement(By.name("username")).clear(); Thread.sleep(3000);
		  driver.findElement(By.id("keepLoggedInCheckBox")).click();
		  Thread.sleep(3000); driver.findElement(By.id("loginButton")).click();
		  Thread.sleep(3000); driver.close();
		 
		
		/*
		 * System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		 * WebDriver driver= new EdgeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.actitime.com/free-online-trial");
		 * driver.findElement(By.id("first-name")).sendKeys("jhilipatel");
		 * driver.findElement(By.id("last-name")).sendKeys("Qspiders");
		 * driver.findElement(By.id("email")).sendKeys("pateljhili401@gmail.com");
		 * driver.findElement(By.id("company")).sendKeys("Qspider"); Thread.sleep(5000);
		 * driver.findElement(By.id("start-trial-submit")).click(); Thread.sleep(5000);
		 * driver.close();
		 */
		

		/*
		 * System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 * WebDriver driver = new FirefoxDriver(); driver.manage().window().maximize();
		 * driver.get("https://demo.actitime.com/login.do"); Thread.sleep(1000);
		 * driver.findElement(By.name("username")).sendKeys("Jhili");
		 * driver.findElement(By.name("pwd")).sendKeys("Qspiders"); Thread.sleep(3000);
		 * driver.findElement(By.name("username")).clear(); Thread.sleep(3000);
		 * driver.findElement(By.id("keepLoggedInCheckBox")).click();
		 * Thread.sleep(3000); driver.findElement(By.id("loginButton")).click();
		 * Thread.sleep(3000); driver.close();
		 * 
		 */

		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "D:/DRIVE PATH/IEDriverServer.exe"); WebDriver driver= new
		 * InternetExplorerDriver(); driver.manage().window().maximize();
		 * driver.get("https://demo.actitime.com/login.do"); Thread.sleep(1000);
		 * driver.findElement(By.id("username")).sendKeys("Jhili");
		 * driver.findElement(By.name("pwd")).sendKeys("Qspiders"); Thread.sleep(3000);
		 * //driver.findElement(By.name("username")).clear(); // Thread.sleep(3000);
		 * driver.findElement(By.id("keepLoggedInCheckBox")).click();
		 * Thread.sleep(3000); driver.findElement(By.id("loginButton")).click();
		 * Thread.sleep(3000); driver.close();
		 */
	}

}
