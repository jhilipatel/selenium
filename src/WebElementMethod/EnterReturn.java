package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterReturn {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//username.sendKeys(Keys.ENTER);
		username.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		driver.close();
		
	}

}
