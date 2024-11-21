package java_practice_newone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Openapplication {

	public static void main(String[] args) throws Exception{
		
	 //Setting the property of chrome browser and passing the chromedriver path
			System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\chromedriver.exe");
			
		//Launching chrome browser instance	
			WebDriver driver = new ChromeDriver();
			
			
			//Wait for given time
			Thread.sleep(2000);
			
			//get method used to open url
			driver.get("https://www.facebook.com/login/");
			
			//To maximize the web page
			driver.manage().window().maximize();
			
			//To delete all cookies
			Thread.sleep(2000);
			driver.manage().deleteAllCookies();
			
			//to open url can use navigate method also
			Thread.sleep(2000);
			driver.navigate().to("https://www.google.com/");
			
			//to refresh the page
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			//to back to previous the page
			Thread.sleep(2000);
			driver.navigate().back();
			
			//to forward again to same  page
			Thread.sleep(2000);
			driver.navigate().forward();
			
			//To get current url
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			
			//To fetch the webpage title
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			
			//close the browser instance
			Thread.sleep(2000);
			 driver.close();

	}

}
