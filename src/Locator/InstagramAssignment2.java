package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramAssignment2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
	    driver.findElement(By.linkText("Sign up")).click();
		/*
		 * WebElement link1 = driver.findElement(By.linkText("Sign up"));
		 * System.out.println(link1.getText()); link1.click();
		 */
	    Thread.sleep(5000);
	    
		driver.findElement(By.name("emailOrPhone")).sendKeys("7894676767");
		Thread.sleep(3000);
		driver.findElement(By.name("fullName")).sendKeys("poojakumari");
		driver.findElement(By.name("username")).sendKeys("Pooja345");	
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Qspiders");
		Thread.sleep(5000);
        driver.close();		

	}

}
