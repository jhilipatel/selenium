package MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BritishAirwaysAutoSuggestionAssignmenetQue4 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.britishairways.com/travel/home/public/en_in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='from']")).sendKeys("liv");
		Thread.sleep(3000);
		List<WebElement> suggestions=driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(suggestions.size());
		for(int i=0; i<suggestions.size(); i++)
		{
			if(suggestions.get(i).getText().equalsIgnoreCase("Livingstone, Livingstone (LVI), Zambia"))
			{
				suggestions.get(i).click();
				break;
			}
		}
		List<WebElement> suggestions2=driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(suggestions2.size());
		for(int i=0; i<suggestions2.size(); i++)
		{
			if(suggestions2.get(i).getText().equalsIgnoreCase("Lviv, Lviv (LWO), Ukraine"))
			{
				Thread.sleep(2000);
				suggestions2.get(i).click();
				break;
			}
		}
		
		driver.close();
	}
}
