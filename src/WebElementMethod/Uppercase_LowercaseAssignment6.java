package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uppercase_LowercaseAssignment6 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");              
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.id("email"));
		//username.sendKeys(Keys.LEFT_SHIFT,"PRIYANKA");  
		String name="Priyanka";
		String uppercaseusername=name.toUpperCase();        
		username.sendKeys(uppercaseusername);
		driver.close();                                     
	}                                                     
}
