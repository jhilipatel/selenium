package Popup;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildPopupWindowHandle {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver( options);
		
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
	
		System.out.println(driver.getWindowHandle());
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		System.out.println(allwindows.size());  //4
		
		//How to switch one browser to another
		
		ArrayList<String> al=new ArrayList<>();
		al.addAll(allwindows);
		System.out.println(allwindows.size());   //4
		
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(al.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(al.get(3));
		//driver.close();                               //NoSuchWindowException
		System.out.println(driver.getTitle());
		driver.close();
	}
}
