package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodAssignment2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("priyanka");
		for(int i=0; i<=0;i++)
		{
			Thread.sleep(1000);
			username.sendKeys(Keys.ARROW_LEFT);
		}
		for(int i=0;i<=0;i++)
		{
			username.sendKeys(Keys.BACK_SPACE);
		}
		for(int i=0; i<=0;i++)
		{
			Thread.sleep(1000);
			username.sendKeys(Keys.ARROW_LEFT);
		}
		for(int i=0;i<=0;i++)
		{
			username.sendKeys(Keys.BACK_SPACE);
		}
		for(int i=0; i<=0;i++)
		{
			Thread.sleep(1000);
			username.sendKeys(Keys.ARROW_LEFT);
		}
		for(int i=0;i<=0;i++)
		{
			username.sendKeys(Keys.BACK_SPACE);
		}
		for(int i=0; i<=0;i++)
		{
			Thread.sleep(1000);
			username.sendKeys(Keys.ARROW_LEFT);
		}
		for(int i=0;i<=0;i++)
		{
			username.sendKeys(Keys.BACK_SPACE);
		}
	}

}
