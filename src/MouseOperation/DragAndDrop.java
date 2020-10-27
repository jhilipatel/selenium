package MouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		
		  WebElement source1 =driver.findElement(By.xpath("//a[.=' SALES ']"));
		  WebElement target1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		  Actions act1 = new Actions(driver);
		  act1.dragAndDrop(source1, target1).perform();
		 		 
		WebElement source=driver.findElement(By.xpath("//a[.=' 5000']"));
		WebElement target=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		WebElement source2=driver.findElement(By.xpath("//a[.=' BANK ']"));
		WebElement target2=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions act2=new Actions(driver);
		act2.dragAndDrop(source2, target2).perform();
		
		WebElement source3=driver.findElement(By.xpath("//a[.=' 5000']"));
		WebElement target3=driver.findElement(By.id("amt7"));
		Actions act3=new Actions(driver);
		act3.dragAndDrop(source3, target3).perform();
		
	}

}
