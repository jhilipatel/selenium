package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadFilehippoAssignment {

	public static void main(String[] args) throws AWTException 
	{
	
		
		  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
			/*
			 * System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 * WebDriver driver=new ChromeDriver();
			 */
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://filehippo.com/");
	    WebElement popularsoftware = driver.findElement(By.xpath("//a[text()='Popular software']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()",popularsoftware); 
	    driver.findElement(By.xpath("//p[.='VLC Media Player 64-bit']/../../../../..//span[.='Download']")).click();
	    driver.findElement(By.xpath("//h1[.='VLC Media Player 64-bit']/../../../../..//a[.='Download Latest Version']")).click();
	    driver.findElement(By.xpath("//a[@title='Close']")).click();
	    Robot r=new Robot();
	    for(int i=0; i<=2; i++)
	    {
	    	 r.keyPress(KeyEvent.VK_SHIFT);
	    }
	       r.keyPress(KeyEvent.VK_ENTER);
	       r.keyRelease(KeyEvent.VK_SHIFT);
	       r.keyRelease(KeyEvent.VK_ENTER);  
	}
}
