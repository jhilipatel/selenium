package Popup;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariChildBrowserPopupAssignmentQuePart2 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		

		   Set<String> congizant = driver.getWindowHandles();
		   Iterator<String> it = congizant.iterator(); 
		   System.out.println(congizant.size());
		   while (it.hasNext()) 
		   {                                                                //This is third way third way
		   driver.switchTo().window(it.next());
		   if (driver.getTitle().equalsIgnoreCase("HSBC"))
		    {
		   System.out.println(driver.getTitle()); 
		   break;
		    } 
		    }
	}          
}
