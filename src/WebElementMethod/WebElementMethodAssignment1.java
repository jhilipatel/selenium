package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.Authentication.User;

public class WebElementMethodAssignment1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("priyanka");
		for(int i=0; i<=4; i++)
		{
			Thread.sleep(1000);
			username.sendKeys(Keys.ARROW_LEFT);
		}
		for(int i=0; i<=2 ;i++)
		{
			Thread.sleep(1000);
			username.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
