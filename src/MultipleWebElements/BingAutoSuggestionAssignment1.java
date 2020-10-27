package MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingAutoSuggestionAssignment1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("search");
		Thread.sleep(2000);
		List<WebElement> suggestions=driver.findElements(By.xpath("//span[@class='sa_tm_text']"));
		System.out.println(suggestions.size());
		for(int i=0; i<suggestions.size(); i++)
		{
			if(suggestions.get(i).getText().equalsIgnoreCase("search history"))
			{
				suggestions.get(i).click();
				break;
			}
		}
		driver.close();
	}
}
