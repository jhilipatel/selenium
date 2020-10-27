package XpathAttributeAndText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraXpathText {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Offers']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		String actualTitle = driver.getTitle();
		if(actualTitle.equalsIgnoreCase("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra"))
		{
			System.out.println("Element is present");
		}
		else {
			System.out.println("Element is not present");
		}
		Thread.sleep(3000);
		driver.close();
		

	}

}
