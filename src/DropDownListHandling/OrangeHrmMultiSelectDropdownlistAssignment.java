package DropDownListHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrmMultiSelectDropdownlistAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//b[.='Directory']")).click();
		WebElement jobtitle = driver.findElement(By.id("searchDirectory_job_title"));
		Select sel=new Select(jobtitle);
		sel.selectByValue("3");
		WebElement location=driver.findElement(By.id("searchDirectory_location"));
		Select sel2=new Select(location);
		sel2.selectByValue("4,-1");
	}
}
