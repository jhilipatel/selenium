package DropDownListHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActitimeMultiSelectDropdownListAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings ']")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//a[.='Types of Work']")).click();
        driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
        WebElement dropdownlist = driver.findElement(By.name("active"));
        Select sel=new Select(dropdownlist);
        System.out.println(sel.isMultiple());
        sel.selectByVisibleText("archived");
        List<WebElement> options = sel.getOptions();
        System.out.println(options.size());
        for(int i=0; i<options.size(); i++)
        {
        	System.out.println(options.get(i).getText());
        }
        
        
	}

}
