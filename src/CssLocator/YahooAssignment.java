package CssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("a[id='header-signin-link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[id='createacc']")).click();
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Poooja");
        driver.findElement(By.cssSelector("input[placeholder='Surname']")).sendKeys("Mishraa");
        driver.findElement(By.cssSelector("input[autocomplete='username']")).sendKeys("mishrapooja@gmail.com");
        driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("Qspiders");
        driver.findElement(By.id("usernamereg-phone")).sendKeys("9876343434");
        Thread.sleep(3000);
        driver.findElement(By.id("usernamereg-month")).sendKeys("JAN");
        driver.findElement(By.id("usernamereg-day")).sendKeys("MON");
        driver.findElement(By.id("usernamereg-year")).sendKeys("2020");
        driver.findElement(By.id("usernamereg-freeformGender")).sendKeys("female");
        Thread.sleep(6000);
        driver.close();
        		

	}

}
