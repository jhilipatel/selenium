package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenSourceHrm {

	public static void main(String[] args) throws InterruptedException {
		
		
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com");
		  driver.findElement(By.id("txtUsername")).sendKeys("JhiliPatel");
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtPassword")).sendKeys("Qspiders");
		  Thread.sleep(3000); driver.findElement(By.id("btnLogin")).click();
		  Thread.sleep(3000); driver.close();
		 
		
		/*
		 * System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		 * WebDriver driver=new EdgeDriver(); driver.manage().window().maximize();
		 * driver.get("https://opensource-demo.orangehrmlive.com/");
		 * driver.findElement(By.id("txtUsername")).sendKeys("Jhilipatel");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("txtPassword")).sendKeys("Qspiders");
		 * Thread.sleep(3000); driver.findElement(By.id("btnLogin")).click();
		 * Thread.sleep(3000); driver.close();
		 */
		
		/*
		 * System.setProperty("webdriver.ie.driver","D:/DRIVE PATH/IEDriverServer.exe");
		 * WebDriver driver= new InternetExplorerDriver();
		 * driver.manage().window().maximize();
		 * driver.get("https://opensource-demo.orangehrmlive.com/"); Thread.sleep(3000);
		 * driver.findElement(By.id("txtUsername")).sendKeys("Jhilipatel");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("txtPassword")).sendKeys("Qspiders");
		 * Thread.sleep(3000); driver.findElement(By.id("btnLogin")).click();
		 * Thread.sleep(3000); driver.close();
		 * 
		 */
		/*
		 * System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 * WebDriver driver = new FirefoxDriver(); driver.manage().window().maximize();
		 * Thread.sleep(3000); driver.get("https://opensource-demo.orangehrmlive.com/");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("txtUsername")).sendKeys("jhilipael");
		 * driver.findElement(By.id("txtPassword")).sendKeys("Qspider");
		 * driver.findElement(By.id("btnLogin")).click(); Thread.sleep(3000);
		 * driver.close();
		 */
        
	}

}
