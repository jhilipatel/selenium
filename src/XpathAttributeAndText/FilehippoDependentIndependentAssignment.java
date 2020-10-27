package XpathAttributeAndText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilehippoDependentIndependentAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://filehippo.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='button home-cover__button button--tertiary'][1]")).click();
		driver.findElement(By.xpath("//span[@title='VLC Media Player 64-bit']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
