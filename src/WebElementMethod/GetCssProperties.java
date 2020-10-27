package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssProperties {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.id("email"));
		System.out.println(username.getCssValue("font_size"));
		System.out.println(username.getCssValue("font_family"));
		System.out.println(username.getCssValue("color"));
		driver.close();
		

	}

}
