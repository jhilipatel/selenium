package DropDownListHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdownListAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:/www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(3000);
		WebElement dropdownlistday = driver.findElement(By.id("day"));
		Select sel = new Select(dropdownlistday );
		sel.selectByVisibleText("14");
		
		WebElement dropdownlistmon = driver.findElement(By.id("month"));
		Select sel2=new Select(dropdownlistmon);
		sel2.selectByVisibleText("Oct");
		
		WebElement dropdownlistyear = driver.findElement(By.id("year"));
		Select sel3 = new Select(dropdownlistyear);
		sel3.selectByVisibleText("2019");
	}
}
