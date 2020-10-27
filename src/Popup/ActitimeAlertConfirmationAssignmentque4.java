package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeAlertConfirmationAssignmentque4 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Leave Types']")).click();
		driver.findElement(By.xpath("//span[.='Create Leave Type']")).click();
		driver.findElement(By.id("leaveTypeLightBox_nameField")).sendKeys("button");
		driver.findElement(By.xpath("(//span[.='Create Leave Type'])[2]")).click();
		driver.findElement(By.xpath("//td[@class='leaveTypeDeleteCell last active']")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		//alt.dismiss();

	}

}
