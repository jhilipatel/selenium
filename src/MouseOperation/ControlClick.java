package MouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ControlClick {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement forgotpassword = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Actions act = new Actions(driver);
		act.sendKeys(Keys.LEFT_CONTROL).click(forgotpassword).perform();
		
	}
}
