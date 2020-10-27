package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {

	public static void main(String[] args) throws AWTException
	{
		/*
		 * System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 * WebDriver driver=new ChromeDriver();
		 */
		 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		
	    Robot r=new Robot();
	    for(int i=0; i<=3; i++)
	    {
	    r.keyPress(KeyEvent.VK_SHIFT);
	    }
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_SHIFT);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}
}
