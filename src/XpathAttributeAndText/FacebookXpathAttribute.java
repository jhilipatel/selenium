package XpathAttributeAndText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookXpathAttribute {

	public static void main(String[] args) throws InterruptedException 
	{
		
		/*
		 * System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.facebook.com"); Thread.sleep(3000);
		 * driver.findElement(By.
		 * xpath("//input[@placeholder='Email address or phone number']")).sendKeys(
		 * "8455097080");
		 * driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(
		 * "putalpp40123"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();
		 * Thread.sleep(3000); driver.close();
		 */

		   System.setProperty("webdriver.edge.diver","./drivers/msedgedriver.exe");
		  WebDriver driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com"); Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys( "8455097080");
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(
		  "putalpp40123"); Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(3000); driver.close();
		 
	}

}
