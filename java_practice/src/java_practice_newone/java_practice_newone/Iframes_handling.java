package java_practice_newone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_handling {

	public static void main(String[] args) throws Exception {
		 //Setting the property of chrome browser and passing the chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA&Eclipse\\chromedriver.exe");
		//Launching chrome browser instance	
		WebDriver driver = new ChromeDriver();
		//Wait for given time
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize screen
		driver.manage().window().maximize();
		//get method used to open url
		driver.get("https://paytm.com/");
		
		//locate element for signin click
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(5000);
		
		// to find the total number of frames present on webpage
		
		int allframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frames : "+allframes);
		
		//check if element is present or not 
		for(int i=0;i<allframes;i++) {
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);
			
			String ExpTxt = "Open Paytm App";
			String abc = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();
			
			if(abc.equalsIgnoreCase(ExpTxt)) {
				System.out.println("Element found");
				break;
			}else {
				System.out.println("Element not found");
			}
		}

	}

}
