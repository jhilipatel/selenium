package XpathAttributeAndText;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCXpathAttribute {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		Thread.sleep(3000);
		WebElement ok=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ok);
		driver.findElement(By.xpath("//input[@formcontrolname='userName']")).sendKeys("Pooja");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Qspiders");
		driver.findElement(By.xpath("//input[@formcontrolname='cnfUsrPwd']")).sendKeys("Qspiders");
		//driver.findElement(By.xpath("//label[@xpath='29']"))
		driver.findElement(By.xpath("//input[@formcontrolname='secAns']")).sendKeys("nothing");
		driver.findElement(By.xpath("//label[@class='ng-tns-c10-5 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']")).sendKeys("English");
		driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("Pooja");
		driver.findElement(By.xpath("//input[@placeholder='Middle Name  [ Optional ]']")).sendKeys("kumari");
		driver.findElement(By.xpath("//input[@formcontrolname='lastname']")).sendKeys("Mishra");
		driver.findElement(By.xpath("//input[@value='M']")).click();
		

	}

}
