package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebPushNotification {

	public static void main(String[] args) 
	{
		/*
		 * System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 * ChromeOptions options=new ChromeOptions();
		 * options.addArguments("--disable-notifications"); WebDriver driver=new
		 * ChromeDriver(options); driver.manage().window().maximize();
		 * driver.get("https://www.redbus.in/");
		 */
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	    FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
	}
}
