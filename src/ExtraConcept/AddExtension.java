package ExtraConcept;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddExtension {

	public static void main(String[] args)
	{
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\soura\\Downloads\\chropath.crx"));
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.co.in/");
		

	}

}
