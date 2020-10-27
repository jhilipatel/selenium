package Popup;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NaukariChieldBrowserPopupAssignmentQue2Part1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> allbrowser=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>();
		al.addAll(allbrowser);                                        //after this line give for loop foe checking index
		driver.switchTo().window(al.get(3));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Cognizant']")).click();
		Set<String> newcognizant = driver.getWindowHandles();
		ArrayList<String> al1 = new ArrayList<>();
		al1.addAll(newcognizant);
		driver.switchTo().window(al1.get(4));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(al.get(3));
		System.out.println(driver.getTitle());
		driver.close();
		System.out.println("********************************************");
		
		Set<String> switchtoamazon = driver.getWindowHandles();
		ArrayList<String> al2=new ArrayList<>();
		al2.addAll(switchtoamazon);
		driver.switchTo().window(al2.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Amazon']")).click();
		Set<String> newamazonwindow = driver.getWindowHandles();
		ArrayList<String> al3 = new ArrayList<>();
		al3.addAll(newamazonwindow);
		driver.switchTo().window(al3.get(3));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(al2.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		System.out.println("***********************************************************");
		
		Set<String> switchtohsbc = driver.getWindowHandles();
		ArrayList<String> al4 = new ArrayList<>();
		al4.addAll(switchtohsbc);
		driver.switchTo().window(al4.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='HSBC']")).click();
		Set<String> newhsbcwindow = driver.getWindowHandles();
		ArrayList<String> al5 = new ArrayList<>();
		al5.addAll(newhsbcwindow);
		driver.switchTo().window(al5.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(al4.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		System.out.println("********************************************************************");
		
		Set<String> switchtoparent = driver.getWindowHandles();
		ArrayList<String> al6=new ArrayList<>();
		al6.addAll(switchtoparent);
		driver.switchTo().window(al6.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[.='Later']")).click();
	}
}
