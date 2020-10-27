package XpathAttributeAndText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmXpathText {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Forgot your password?']")).click();
		Thread.sleep(3000);
		WebElement link=driver.findElement(By.xpath("//a[.='Forgot your password?']"));
		System.out.println(link.getText());
		driver.close();
		

	}

}
