package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("Priyanka");
        username.sendKeys(Keys.CONTROL,"a");
        username.sendKeys(Keys.CONTROL,"c");
        WebElement password=driver.findElement(By.name("pass"));
        password.sendKeys(Keys.CONTROL,"v");
        Thread.sleep(2000);
        driver.close();
	}

}
