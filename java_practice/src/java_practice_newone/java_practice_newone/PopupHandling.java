package java_practice_newone;

import java.util.Iterator;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws Exception {
		 //Setting the property of chrome browser and passing the chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA&Eclipse\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	   //To maximize the web page
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get method used to open url
		driver.get("https://demoqa.com/browser-windows");
		
		//1st way - Tab handling 
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('tabButton').click()");
		
        //To get the total counT of open  tab/windows
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);
		Iterator<String> abc = allWindowsId.iterator();
		
	    String Win1 = abc.next();
	    String Win2 = abc.next();
	    
	    
	   //print the title of parent window
	    driver.switchTo().window(Win1);
	    System.out.println("Parent Tab Id :" + Win1);// alphanumeric id 1
	    
	  //print the current url  of child window
	    Thread.sleep(2000);
	    driver.switchTo().window(Win2);
	    Thread.sleep(2000);
	    System.out.println("Child Tab Id :" + Win2);// alphanumeric id 2
	    
	    Thread.sleep(2000);
	    System.out.println(driver.getCurrentUrl());//child tab url
	    
	    //to handle new windows
	    Thread.sleep(2000);
	    driver.switchTo().window(Win1);
	    jse.executeScript("document.getElementById('windowButton').click()");
	    System.out.println(driver.getTitle());
	    
	    //print the id of parent and child window
	    Set<String> allWindowsId2 = driver.getWindowHandles();
		System.out.println(allWindowsId2);
		Iterator<String> abc1 = allWindowsId2.iterator();
		
	    String Win3 = abc.next();
	    String Win4 = abc.next();
	    
	    
	    //to print the parent window id ;
	    
	    Thread.sleep(2000);
	    System.out.println("Parent  window Id :" + Win3);
	    driver.getTitle();
	    Thread.sleep(2000);
	    driver.switchTo().window(Win4);
	    System.out.println("child  window Id :" + Win4);
	    driver.getTitle();
	    
	}

}
