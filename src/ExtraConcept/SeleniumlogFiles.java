package ExtraConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumlogFiles {

	public static void main(String[] args) throws InterruptedException 
	{/*
		 * System.setProperty("webdriver.chrome.logfile","./seleniumlogs/chromelog.txt")
		 * ; System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 * WebDriver driver = new ChromeDriver();
		 */
		
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"./seleniumlogs/firefoxlog.txt");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.name("remember")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());

	}
}
