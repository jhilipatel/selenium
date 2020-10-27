package ZzzExtraPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[.='Sign In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='id_userLoginId']")).sendKeys("pateljhili401@gmail.com");
		driver.findElement(By.id("id_password_toggle")).sendKeys("putalpp40123");
		driver.findElement(By.cssSelector("button[data-uia='login-submit-button']")).click();
		driver.close();
		

	}

}
