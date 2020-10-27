package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForwardRefresh {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().to("https://www.myntra.com");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();

	}
}
