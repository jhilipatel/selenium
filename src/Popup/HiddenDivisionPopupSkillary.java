package Popup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopupSkillary {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.skillrary.com/");
		WebElement adpopup=driver.findElement(By.xpath("//button[.='×']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",adpopup);
        
	}
}
