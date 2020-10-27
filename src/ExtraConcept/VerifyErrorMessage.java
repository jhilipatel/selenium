package ExtraConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		WebElement errormessage = driver.findElement(By.xpath("//span[@class='jibhHc']"));
		String actualerrormessage = errormessage.getText();
		String expectederrormessage = "Enter an email or phone number";
		if(actualerrormessage.equalsIgnoreCase(expectederrormessage) )
		{
			System.out.println("Both are matching");
		}
		else
		{
			System.out.println("both are not matching");
		}
	}
}
