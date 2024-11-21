package java_practice_newone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHanding {

	public static void main(String[] args) throws Exception {
		
		//Setting the property of chrome browser and passing the chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA&Eclipse\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	   //To maximize the web page
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get method used to open url
		driver.get("https://demoqa.com/alerts");
		

		
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("document.getElementById('confirmButton').click()");
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted ");
		
		jse.executeScript("document.getElementById('confirmButton').click()");
		
		driver.switchTo().alert().dismiss();
		
		System.out.println("Alert dismissed ");
		
		
		//alertButton
		jse.executeScript("document.getElementById('alertButton').click()");
         Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted ");
		
		
		
		
		
		
		
		
		
		
		

	}

}
