package DropDownListHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcDropdownlistAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		/*
		 * WebElement countrycode =
		 * driver.findElement(By.xpath("//select[@formcontrolname='resCountry']"));
		 * countrycode.click(); Select sel1 = new Select(countrycode );
		 * sel1.selectByValue("15");
		 * 
		 * WebElement nationality =
		 * driver.findElement(By.xpath("//select[@formcontrolname='nationality']"));
		 * nationality.click(); Select sel2 = new Select(nationality);
		 * sel2.selectByValue("15"); nationality.click();
		 */
		
		/*
		 * WebElement cityortown =
		 * driver.findElement(By.xpath("//select[@formcontrolname='resCity']"));
		 * cityortown.click(); Select sel3 = new Select(cityortown);
		 * sel3.selectByValue("Select city");
		 * 
		 * WebElement postoffice =
		 * driver.findElement(By.xpath("//select[@formcontrolname='resPostOff']"));
		 * postoffice.click(); Select sel4 = new Select(postoffice);
		 * sel4.selectByValue("Select a Post Office");
		 */
		WebElement pincode=driver.findElement(By.xpath("//input[@placeholder='Pin code']"));
		pincode.sendKeys("768204");
		pincode.sendKeys(Keys.ENTER);
		
		
	}
}
