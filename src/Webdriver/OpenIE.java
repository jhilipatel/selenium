package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","D:/DRIVE PATH/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();

	}

}
