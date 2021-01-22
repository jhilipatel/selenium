package MultipleWebElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena {

	public static void main(String[] args) 
	{
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.gsmarena.com/");
	    
	    List<WebElement> link = driver.findElements(By.xpath("//a"));
	    System.out.println(link.size());
	    for(int i=0; i<link.size(); i++)
	    {
	    	System.out.println(link.get(i).getText());
	    	System.out.println(link.get(i).getAttribute("href"));
	    }

	}

}
