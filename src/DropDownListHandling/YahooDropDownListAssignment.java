package DropDownListHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahooDropDownListAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/?p=us");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Sign in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("createacc")).click();
		Thread.sleep(5000);
		
		  WebElement countrycode = driver.findElement(By.xpath("//select[@type='select']")); 
		  countrycode.click();
		  Select sel1 = new Select(countrycode); 
		  sel1.selectByValue("AL");
		 
		 WebElement birthmonth = driver.findElement(By.id("usernamereg-month"));
		 birthmonth.click();
		 Select sel2 = new Select(birthmonth);
		 sel2.selectByValue("3");
		 birthmonth.click(); 
	}
}
