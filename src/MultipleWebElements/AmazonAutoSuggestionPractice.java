package MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggestionPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		WebElement searchbar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		searchbar.sendKeys("mobile");
		System.out.println(searchbar.getSize());
		Thread.sleep(3000);
		for(int i=0; i<6; i++) {
			Thread.sleep(2000);
			searchbar.sendKeys(Keys.ARROW_DOWN);
		}
		searchbar.sendKeys(Keys.ENTER);	
	}
}
