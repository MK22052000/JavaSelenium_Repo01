package java_practice_newone;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Radiobutton {

	public static void main(String[] args) throws Exception {

		 //Setting the property of chrome browser and passing the chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	   //To maximize the web page
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get method used to open url
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("meghakeerthi");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value"));
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rajendran");
		 
		
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
 
		 Select bm = new Select(day);
		
		 bm.selectByVisibleText("22");
		 
		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		 Select bm1 = new Select(month);
		
		 bm1.selectByVisibleText("May");
		 
		 WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		 Select bm2 = new Select(year);
		 
		 bm2.selectByVisibleText("2000");
		 
		 driver.findElement(By.xpath("//input[@value='2']")).click();
		 
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9080615293");
		
		 driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Madurai"); 
          
	}

}
