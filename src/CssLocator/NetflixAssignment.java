package CssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(3000);
		 
		driver.findElement(By.name("userLoginId")).sendKeys("poojamishra");
		driver.findElement(By.name("password")).sendKeys("Qspiders");
		Thread.sleep(3000);
		driver.close();

	}

}
