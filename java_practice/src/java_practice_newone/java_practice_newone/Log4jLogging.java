package java_practice_newone;

import java.util.concurrent.TimeUnit;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jLogging {

	public static void main(String[] args) {
		
		//Create Logger instance 
		Logger logger = Logger.getLogger("Log4jLogging");
		
		//Configure Log4j.propertiesfile
		PropertyConfigurator.configure("C:\\Users\\Megha keerthi R\\eclipse-workspace\\java_practice\\Repository\\log4j.properties");
		
		
		//open browser instance
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA&Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		logger.info("Chrome browser opened");
		
		//mazimize the window
		driver.manage().window().maximize();
		logger.info("Mazimized the window");
		
		//implicity wait given
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Implicity wait given");
		
		//check that webelemnt is dispalyed or not 
		try {
		driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
		logger.info("element found");
		}catch(Exception e) {
			logger.info("Failure - element not found");
			
		}
		
		
	}

}
