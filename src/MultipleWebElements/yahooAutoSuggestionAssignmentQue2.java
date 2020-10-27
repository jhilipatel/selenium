package MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooAutoSuggestionAssignmentQue2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/?p=us");
		Thread.sleep(3000);
		WebElement searchbar=driver.findElement(By.id("header-search-input"));
	    searchbar.sendKeys("corona");
		Thread.sleep(2000);
		//List<WebElement> suggestions=driver.findElements(By.xpath("//b[contains(text(),'corona')]/.."));
		List<WebElement> suggestions=driver.findElements(By.xpath("//span[contains(text(),' update')]"));
		System.out.println(suggestions.size());
		for(int i=0; i<suggestions.size(); i++)
		{
			if(suggestions.get(i).getText().equalsIgnoreCase("corona update"))
			{
				Thread.sleep(3000);
				//searchbar.sendKeys(Keys.ARROW_DOWN);
				suggestions.get(i).click();
				break;
			}
		}
	}
}
