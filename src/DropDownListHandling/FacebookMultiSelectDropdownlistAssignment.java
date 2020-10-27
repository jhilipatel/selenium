package DropDownListHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookMultiSelectDropdownlistAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement daydropdownlist = driver.findElement(By.id("day"));
		Select sel=new Select(daydropdownlist);
		/*
		 * sel.selectByVisibleText("2"); sel.deselectByVisibleText("2");
		 */
		List<WebElement> options = sel.getOptions();
		System.out.println(options.size());
		for(int i=0; i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
	}

}
