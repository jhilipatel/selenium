package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteWithoutShortcut {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("priyanka");
		String usernamevalue=username.getAttribute("value");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys(usernamevalue);            
		String passwordvalue=password.getAttribute("value");
		if(passwordvalue.equalsIgnoreCase(usernamevalue))
		{
		  	System.out.println("copy paste successful");
		}                       
		else {
		 System.out.println("copy paste not successful");
		}	
	}
}
