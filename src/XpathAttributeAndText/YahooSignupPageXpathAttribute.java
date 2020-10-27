package XpathAttributeAndText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSignupPageXpathAttribute {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='header-signin-link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='createacc']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Pooja");
		driver.findElement(By.xpath("//input[@placeholder='Surname']")).sendKeys("Mishra");
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("Mishrapooja@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Mobile phone number']")).sendKeys("7894676545");
		driver.findElement(By.xpath("//select[@name='mm']")).sendKeys("January");
		driver.findElement(By.xpath("//input[@placeholder='Day']")).sendKeys("Sunday");
		driver.findElement(By.xpath("//input[@name='yyyy']")).sendKeys("2020");
		driver.findElement(By.xpath("//input[@placeholder='Gender (optional)']")).sendKeys("female");
		driver.findElement(By.xpath("//button[@data-rapid-tracking='true']")).click();
		Thread.sleep(3000);
		driver.close();
		
				

	}

}
