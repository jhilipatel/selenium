package DropDownListHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahoomultiSelectDropdownList {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/?p=us");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		WebElement birthmonth = driver.findElement(By.name("mm"));
		Select sel = new Select(birthmonth);
		//System.out.println(sel.isMultiple());
		/*
		 * //sel.selectByValue("2"); //sel.selectByIndex(2); //sel.deselectAll();
		 */		
		List<WebElement> options = sel.getOptions();
		System.out.println(options.size());
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		WebElement countrycode = driver.findElement(By.name("shortCountryCode"));
		Select sel2=new Select(countrycode);
		List<WebElement> options2= sel2.getOptions();
		System.out.println(options2.size());
		for(int i=0; i<options2.size(); i++)
		{
			System.out.println(options2.get(i).getText());
		}	
	}
}
