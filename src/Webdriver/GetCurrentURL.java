package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import okhttp3.Challenge;

public class GetCurrentURL {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		/*
		 * String title= driver.getCurrentUrl(); 
		 * System.out.println(title);
		 */
		System.out.println(driver.getCurrentUrl());

	}

}
