package CssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Samira");
		driver.findElement(By.name("lastname")).sendKeys("Agrawal");
		driver.findElement(By.name("reg_email__")).sendKeys("455094567");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Qspiders");
		Thread.sleep(3000);
        driver.close();		

	}

}
