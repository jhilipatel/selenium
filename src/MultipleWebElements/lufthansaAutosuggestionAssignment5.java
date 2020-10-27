package MultipleWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lufthansaAutosuggestionAssignment5 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lufthansa.com/in/en/homepage");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@placeholder='From']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("del");
		Thread.sleep(3000);
		

	}

}
