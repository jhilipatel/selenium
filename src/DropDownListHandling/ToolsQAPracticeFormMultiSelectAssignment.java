package DropDownListHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class ToolsQAPracticeFormMultiSelectAssignment {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("Pooja");
		driver.findElement(By.id("lastName")).sendKeys("Mishra");
		driver.findElement(By.id("userEmail")).sendKeys("poojamis123@gmail.com");
		driver.findElement(By.xpath("//label[.='Male']")).click();
		driver.findElement(By.xpath("//label[.='Female']")).click();
		driver.findElement(By.xpath("//label[.='Other']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9987565656");
		List<WebElement> checkbox = driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']"));
		System.out.println(checkbox.size());
		for(int i=0; i<checkbox.size();i++)
		{
			Thread.sleep(1000);
			checkbox.get(i).click();
		}
		WebElement selectstate = driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",selectstate);
		
		//selectstate.sendKeys("Rajasthan");
	}
}
