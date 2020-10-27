package XpathAttributeAndText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class ActitimeDependentIndependent {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Types of Work']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='ext-comp-1002']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Priyanka");
		driver.findElement(By.xpath("//input[@value='   Create Type of Work   ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Priyanka']/../..//a[contains(text(),'delete')]")).click();
	    Thread.sleep(3000);
	    driver.close();
		

	}

}
