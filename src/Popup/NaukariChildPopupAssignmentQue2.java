package Popup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariChildPopupAssignmentQue2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");

		
		/*
		 * //System.out.println(driver.getWindowHandle()); Set<String>
		 * congizantwindow=driver.getWindowHandles();
		 * //System.out.println(congizantwindow);
		 * System.out.println(congizantwindow.size()); ArrayList<String> al=new
		 * ArrayList<>(); al.addAll(congizantwindow);
		 * driver.switchTo().window(al.get(3)); System.out.println(driver.getTitle());
		 * Thread.sleep(5000);
		 * 
		 * driver.manage().window().maximize(); Thread.sleep(3000);
		 * //System.out.println(congizantwindow.size());
		 * driver.findElement(By.xpath("//img[@alt='Cognizant']")).click();
		 * 
		 * 
		 * Set<String> cognizantnextwindow=driver.getWindowHandles();
		 * //System.out.println(cognizantnextwindow.size());
		 * al.addAll(cognizantnextwindow);
		 * System.out.println("**************************************"); for(int i=0;
		 * i<cognizantnextwindow.size(); i++) { driver.switchTo().window(al.get(i));
		 * System.out.println(driver.getTitle()); }
		 * 
		 * driver.switchTo().window(al.get(3)); System.out.println(driver.getTitle());
		 * driver.close();
		 */
		  
		  
			/*
			 * Set<String> congizant = driver.getWindowHandles(); for(String o : congizant)          //This is forth way
			 * { driver.switchTo().window(o); if
			 * (driver.getTitle().equalsIgnoreCase("HSBC")) {
			 * System.out.println(driver.getTitle()); }
			 * 
			 * }
			 */
		
		   Set<String> congizant = driver.getWindowHandles();
		   Iterator<String> it = congizant.iterator(); 
		   System.out.println(congizant.size());
		   while (it.hasNext()) 
		   {                                                                //This is third way third way
		    driver.switchTo().window(it.next());
		    if (driver.getTitle().equalsIgnoreCase("HSBC"))
		    {
		    System.out.println(driver.getTitle()); 
		    break;
		    } 
		    }
		

	/*
	 * String parentwindow = it.next(); String childwindow = it.next(); //This is
	 * second way driver.switchTo().window(childwindow);
	 * System.out.println(driver.getTitle());
	 * 
	 */
		
		
		
		
		
		
			/*
			 * Set<String> congizant = driver.getWindowHandles();
			 *  ArrayList<String> al = new
			 * ArrayList<>(); // This is one different way teacher taught
			 * al.addAll(congizant); //for(int i=0; i<al.size(); i++) //{
			 * driver.switchTo().window(al.get(3)); driver.manage().window().maximize();
			 * System.out.println(driver.getTitle());
			 * System.out.println("***********************************"); // }
			 * 
			 * driver.findElement(By.xpath("//img[@alt='Cognizant']")).click(); Set<String>
			 * newcongzant = driver.getWindowHandles(); ArrayList<String> al1 = new
			 * ArrayList<>(); al1.addAll(newcongzant); //for (int i = 0; i < al1.size();
			 * i++) //after using this for loop just comment it //{
			 * driver.switchTo().window(al1.get(4)); System.out.println(driver.getTitle());
			 * //} driver.close(); driver.switchTo().window(al.get(3)); driver.close();
			 */
	}
}
