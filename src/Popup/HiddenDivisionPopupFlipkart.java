package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenDivisionPopupFlipkart {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
        
		WebElement electronics=driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(electronics).click().perform();
		WebElement honor=driver.findElement(By.xpath("//a[.='Honor']"));
		act.moveToElement(honor).click().perform();
	}

}
