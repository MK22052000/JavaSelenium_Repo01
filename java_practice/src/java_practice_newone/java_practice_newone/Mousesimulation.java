package java_practice_newone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousesimulation {

	public static void main(String[] args) throws Exception {
		//Radio buttons operating on facebook login page
		
		 //Setting the property of chrome browser and passing the chromedriver path
				System.setProperty("webdriver.chrome.driver", "D:\\JAVA&Eclipse\\chromedriver.exe");
				//Launching chrome browser instance	
				WebDriver driver = new ChromeDriver();
				//Wait for given time
				Thread.sleep(2000);
				//maximize screen
				driver.manage().window().maximize();
				//get method used to open url
				driver.get("https://www.flipkart.com/big-billion-day-store?param=2793&s_kwcid=AL!739!3!676201929245!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=CjwKCAjwx4O4BhAnEiwA42SbVDtdvduYg_eet4ORojFRZGWJJlEaa6P3gR7aDU9wNWSh1uZhwmsosRoCsl8QAvD_BwE");

				  
				//create a electronics webelement  reference
				
				WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
				electro.click();
				
				//Mpuse simulation using Actions class 
				Actions act = new Actions(driver);  //  driver reference because action class looking for webdriver 
	
	              //mouse hover to electronics 
	          	Thread.sleep(2000);
	            act.moveToElement(electro).build().perform();;
	            driver.findElement(By.xpath("//*[text()='Mobiles']")).click();
	            
	            //keyboard operations
	            driver.navigate().refresh();
	            Thread.sleep(2000);
	            WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
	            act.sendKeys(men, Keys.ENTER).build().perform();
	            System.out.println("Men clicked");
	       
	      
	        
	            Thread.sleep(2000);
	            act.contextClick(electro).build().perform();
	
	
	
	
	}
	

	

}
