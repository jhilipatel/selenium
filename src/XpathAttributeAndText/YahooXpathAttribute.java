package XpathAttributeAndText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooXpathAttribute {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='header-signin-link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@autocapitalize='none']")).sendKeys("Poojamishra");
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
