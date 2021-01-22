package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NetflixAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		  driver.get("https://www.Netflix.com"); Thread.sleep(2000);
		  driver.findElement(By.partialLinkText("Sign")).click();
		  driver.findElement(By.id("id_userLoginId")).sendKeys("pateljhili@gmail.com");
		  driver.findElement(By.id("id_password")).sendKeys("Qspider");
		  Thread.sleep(3000);
		  driver.findElement(By.className("login-remember-me-label-text")).click();
		  Thread.sleep(3000); driver.findElement(By.linkText("Need help?")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("forgot_password_input")).sendKeys(
		  "pateljhili@gmail.com"); Thread.sleep(3000); driver.navigate().back();
		  driver.findElement(By.linkText("Sign up now")).click(); Thread.sleep(3000);
		  driver.findElement(By.name("email")).sendKeys("pateljhili@gmail.com");
		  Thread.sleep(3000); driver.close();
		 
		
		/*
		 * System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 * WebDriver driver = new FirefoxDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.Netflix.com"); Thread.sleep(2000);
		 * driver.findElement(By.partialLinkText("Sign")).click();
		 * driver.findElement(By.id("id_userLoginId")).sendKeys("pateljhili@gmail.com");
		 * driver.findElement(By.id("id_password")).sendKeys("Qspider");
		 * Thread.sleep(3000);
		 * driver.findElement(By.className("login-remember-me-label-text")).click();
		 * Thread.sleep(3000); driver.findElement(By.linkText("Need help?")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("forgot_password_input")).sendKeys(
		 * "pateljhili@gmail.com"); Thread.sleep(3000); driver.navigate().back();
		 * driver.findElement(By.linkText("Sign up now")).click(); Thread.sleep(3000);
		 * driver.findElement(By.name("email")).sendKeys("pateljhili@gmail.com");
		 * Thread.sleep(3000); driver.close();
		 */
		
		/*
		 * System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		 * WebDriver driver = new EdgeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.Netflix.com"); Thread.sleep(2000);
		 * driver.findElement(By.partialLinkText("Sign")).click();
		 * driver.findElement(By.id("id_userLoginId")).sendKeys("pateljhili@gmail.com");
		 * driver.findElement(By.id("id_password")).sendKeys("Qspider");
		 * Thread.sleep(3000);
		 * driver.findElement(By.className("login-remember-me-label-text")).click();
		 * Thread.sleep(3000); driver.findElement(By.linkText("Need help?")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("forgot_password_input")).sendKeys(
		 * "pateljhili@gmail.com"); Thread.sleep(3000); driver.navigate().back();
		 * driver.findElement(By.linkText("Sign up now")).click(); Thread.sleep(3000);
		 * driver.findElement(By.name("email")).sendKeys("pateljhili@gmail.com");
		 * Thread.sleep(3000); driver.close();
		 */
		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "D:/DRIVE PATH/IEDriverServer.exe"); WebDriver driver = new
		 * InternetExplorerDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.Netflix.com"); Thread.sleep(2000);
		 * driver.findElement(By.partialLinkText("Sign")).click();
		 * driver.findElement(By.id("id_userLoginId")).sendKeys("pateljhili@gmail.com");
		 * driver.findElement(By.id("id_password")).sendKeys("Qspider");
		 * Thread.sleep(3000);
		 * driver.findElement(By.className("login-remember-me-label-text")).click();
		 * Thread.sleep(3000); driver.findElement(By.linkText("Need help?")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("forgot_password_input")).sendKeys(
		 * "pateljhili@gmail.com"); Thread.sleep(3000); driver.navigate().back();
		 * driver.findElement(By.linkText("Sign up now")).click(); Thread.sleep(3000);
		 * driver.findElement(By.name("email")).sendKeys("pateljhili@gmail.com");
		 * Thread.sleep(3000); driver.close();
		 */
	}

}
