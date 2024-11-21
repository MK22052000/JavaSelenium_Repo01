package java_practice_newone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Paytmpractice {

	public static void main(String[] args) {
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
				
				driver.findElement(By.xpath("//*[text()='Paytm for Consumer']")).click();
				
				WebElement abc = driver.findElement(By.xpath("//*[text()='Payments']"));
				Actions act = new Actions(driver);
				act.moveToElement(abc).build().perform();
				
				WebElement abc1 = driver.findElement(By.xpath("//*[text()='Bill Payment & Recharges']"));
				Actions act1 = new Actions(driver);
				act1.moveToElement(abc1).build().perform();
				abc1.click();
				driver.navigate().back();
				

	}
	

}
