package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWidthHeight {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement actitimelogo=driver.findElement(By.xpath("//div[@class='atLogoImg']"));
		System.out.println(actitimelogo.getSize().getHeight());
		System.out.println(actitimelogo.getSize().getWidth());
		driver.close();
        
	}

}
