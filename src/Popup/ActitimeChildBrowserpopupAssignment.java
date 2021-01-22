package Popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeChildBrowserpopupAssignment {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		
		System.out.println(driver.getWindowHandle());
		Set<String> nextwindow=driver.getWindowHandles();
		System.out.println(nextwindow.size());
		ArrayList<String> al=new ArrayList<>();
		al.addAll(nextwindow);
		System.out.println(al.size());
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[.='Try Free']")).click();
		  driver.findElement(By.id("first-name")).sendKeys("Pooja");
		  driver.findElement(By.id("last-name")).sendKeys("mishra");
		  driver.findElement(By.id("email")).sendKeys("Poojamishra343@gmail.com");
		  driver.findElement(By.id("company")).sendKeys("Htc");
		  driver.close();
		  driver.switchTo().window(al.get(0));
		  System.out.println(driver.getTitle());
			
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			driver.findElement(By.xpath("//a[.='Logout']")).click();
			driver.close();
		  
	}
}
