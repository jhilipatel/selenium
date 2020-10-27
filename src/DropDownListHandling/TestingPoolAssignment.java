package DropDownListHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingPoolAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testingpool.com/wp-content/uploads/2015/08/DemoApplication.html");
		Thread.sleep(3000);
		driver.findElement(By.id("firstname")).sendKeys("priyanka");
		driver.findElement(By.id("lastname")).sendKeys("Mishra");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("female")).click();
		WebElement weakdropdownlist = driver.findElement(By.name("Week"));
		Select sel=new Select( weakdropdownlist);
		System.out.println(sel.isMultiple());
		sel.selectByVisibleText("Tuesday");
		sel.selectByVisibleText("Wednesday");
		sel.selectByValue("Fri");
		sel.selectByValue("Sun");
		//sel.deselectAll();
		sel.deselectByValue("Fri");
		List<WebElement> options = sel.getAllSelectedOptions();
		System.out.println(options.size());
		for(int i=0;i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
         List<WebElement> multiplelinks = driver.findElements(By.xpath("//a"));
         System.out.println(multiplelinks.size());
         for(int i=0; i<multiplelinks.size(); i++)
         {
        	 System.out.println(multiplelinks.get(i).getText());
        	 System.out.println(multiplelinks.get(i).getAttribute("href"));
         }
         WebElement dropdownlist = driver.findElement(By.name("number"));
         Select sel2 = new Select(dropdownlist);
         System.out.println(sel2.isMultiple());
         sel2.selectByValue("three");
         
         List<WebElement> checkbox = driver.findElements(By.cssSelector("input[type='checkbox']"));
         for(int i=0; i<checkbox.size(); i++)
         {
        	  checkbox.get(i).click();
         }
         driver.findElement(By.xpath("//button[.='Submit']")).click();
	}
}
