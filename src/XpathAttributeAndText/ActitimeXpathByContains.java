package XpathAttributeAndText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeXpathByContains {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		    WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demo.actitime.com/login.do");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//input[contains(@placeholder,'Username')][1]")).sendKeys("pooja");
		    driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("misbra");
		    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		    driver.findElement(By.id("loginButton")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[text()='Return to login page']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		    Thread.sleep(2000);
		    driver.quit();

	}

}
