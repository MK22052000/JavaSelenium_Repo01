package java_practice_newone;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		
		
		//Specify the location of 1st  properties file 
		File src1 = new File("C:\\Users\\Megha keerthi R\\eclipse-workspace\\java_practice\\Repository\\Config.properties");
		
		//Create File input stream class object to load file 
		FileInputStream fis = new FileInputStream(src1);
		
		//create properties class object to read properties file 
		Properties pro1 = new Properties();
		pro1.load(fis);
		
		
		//Specify the location of 2nd  properties file 
				File src2 = new File("C:\\Users\\Megha keerthi R\\eclipse-workspace\\java_practice\\Repository\\locators.properties");
				
				//Create File input stream class object to load file 
				FileInputStream fis1 = new FileInputStream(src2);
				
				//create properties class object to read properties file 
				Properties pro2 = new Properties();
				pro2.load(fis1);
				
				
		//Specify the location of 3rd  properties file 
				File src3 = new File("C:\\Users\\Megha keerthi R\\eclipse-workspace\\java_practice\\Repository\\Testdata.properties");
				
				//Create File input stream class object to load file 
				FileInputStream fis2 = new FileInputStream(src3);
				
				//create properties class object to read properties file 
				Properties pro3 = new Properties();
				pro3.load(fis2);
				
				 //Setting the property of chrome browser and passing the chromedriver path
				System.setProperty("webdriver.chrome.driver", "D:\\JAVA&Eclipse\\chromedriver.exe");
			     WebDriver driver = new ChromeDriver();
			   //To maximize the web page
					driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//get method used to open url
				driver.get(pro1.getProperty("URL_1"));
				
				//getProperty() will accept the key and return the value of that key
				
				driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("Testdata1"));
				driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("Testdata2"));
				Thread.sleep(2000);
				driver.quit();
				System.out.println("Window Quited  ");
				
				
				


	}

}
