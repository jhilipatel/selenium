package XpathAttributeAndText;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

public class NetflixXpathByContains {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='authLinks redButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-uia='login-field']")).sendKeys("Pooja"); 
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//label[@for='id_password']")).sendKeys("Qspiders");	
	    WebElement rememberme=driver.findElement(By.xpath("//label[@for='bxid_rememberMe_true']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", rememberme);
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-uia='login-submit-button']")).click();
		

	}

}