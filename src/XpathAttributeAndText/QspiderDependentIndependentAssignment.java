package XpathAttributeAndText;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class QspiderDependentIndependentAssignment {

	public static void main(String[] args) throws InterruptedException
	{
		/*
		 * System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 * WebDriver driver= new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://qspiders.com/"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//span[.='Contact']")).click();
		 * 
		 * Thread.sleep(3000); WebElement number=driver.findElement(By.xpath(
		 * "//p[.='Noida']/../..//span[contains(text(),'+91')]"));
		 * System.out.println(number.getText()); Thread.sleep(3000); WebElement
		 * number2=driver.findElement(By.
		 * xpath("//p[.='United States']/../..//span[contains(text(),'+1')]"));
		 * System.out.println(number2.getText()); driver.close();
		 */   
		
		/*
		 * System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 * WebDriver driver= new FirefoxDriver(); driver.manage().window().maximize();
		 * driver.get("https://qspiders.com/"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//span[.='Contact']")).click();
		 * 
		 * Thread.sleep(3000); WebElement number=driver.findElement(By.xpath(
		 * "//p[.='Noida']/../..//span[contains(text(),'+91')]"));
		 * System.out.println(number.getText()); Thread.sleep(3000); WebElement
		 * number2=driver.findElement(By.
		 * xpath("//p[.='United States']/../..//span[contains(text(),'+1')]"));
		 * System.out.println(number2.getText()); driver.close();
		 */
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://qspiders.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Contact']")).click();
		
		Thread.sleep(3000);
		WebElement number=driver.findElement(By.xpath("//p[.='Noida']/../..//span[contains(text(),'+91')]"));
		System.out.println(number.getText());
		Thread.sleep(3000);
		WebElement number2=driver.findElement(By.xpath("//p[.='United States']/../..//span[contains(text(),'+1')]"));
		System.out.println(number2.getText());
		driver.close();  
	}

}
