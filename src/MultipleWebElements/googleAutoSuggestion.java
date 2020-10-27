package MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		Thread.sleep(3000);
		//List<WebElement> suggestions=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		List<WebElement> suggestions=driver.findElements(By.xpath("//span[contains(text(),'selenium')]/.."));
		System.out.println(suggestions.size());
		for(int i=0; i<suggestions.size(); i++)
		{
			//if(suggestions.get(i).getText().equalsIgnoreCase("selenium interview questions"))
				if(suggestions.get(i).getText().equalsIgnoreCase("selenium tutorial"))
			{
				suggestions.get(i).click();
				break;
			}
		}
		driver.close();
	}

}
