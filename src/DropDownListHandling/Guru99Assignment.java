package DropDownListHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Assignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("priyanka");
		driver.findElement(By.name("lastName")).sendKeys("Mishra");
		driver.findElement(By.name("phone")).sendKeys("9937878787");
		driver.findElement(By.id("userName")).sendKeys("mishrapriyanka23@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Malimunda");
		driver.findElement(By.name("city")).sendKeys("Jharsuguda");
		driver.findElement(By.name("state")).sendKeys("Odisha");
		driver.findElement(By.name("postalCode")).sendKeys("676764");
		
		WebElement dropdownlist = driver.findElement(By.name("country"));
		Select sel = new Select(dropdownlist);
		System.out.println(sel.isMultiple());
		sel.selectByVisibleText("ANGOLA");
		List<WebElement> options = sel.getOptions();
		System.out.println(options.size());
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		driver.findElement(By.name("email")).sendKeys("mishrapriyanka23@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Qspiders");
		driver.findElement(By.name("confirmPassword")).sendKeys("Qspiders");
		driver.findElement(By.name("submit")).click();
	}

}
