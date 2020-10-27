package XpathAttributeAndText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmXpathAttribute {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("poojamishra");
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Qspiders");
		driver.findElement(By.xpath("//input[@class='button']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
