package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActualTitle {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String actualTitle = driver.getTitle();
		if(actualTitle.equalsIgnoreCase("google"))
		{
			System.out.println("title matched");
		}
		else {
			System.out.println("Title are not matching");
		}
		Thread.sleep(3000);
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.contains(".com"))
		{
			System.out.println("its present");
		}
		else {
			System.out.println("its not present");
		}
		Thread.sleep(3000);
		driver.close();
	}

}
