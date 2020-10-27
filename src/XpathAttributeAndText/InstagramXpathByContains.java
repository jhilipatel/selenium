package XpathAttributeAndText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramXpathByContains {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Forgot ')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Account')][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile ')]")).sendKeys("7867545434");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Name')]")).sendKeys("Pooja");
		driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("Poojamishra");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Qspiders");
		Thread.sleep(3000);
		driver.close();

	}

}
