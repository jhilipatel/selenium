package XpathAttributeAndText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpathByContains {

	public static void main(String[] args) throws InterruptedException
	{
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@type='text'][@class='inputtext _55r1 _6luy']")).sendKeys("pooja");
	    driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy'])[2]")).sendKeys("Qspiders");
	    driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	    Thread.sleep(3000);

	    driver.close();
	}

}
