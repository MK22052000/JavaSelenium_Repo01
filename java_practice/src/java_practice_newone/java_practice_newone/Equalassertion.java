package java_practice_newone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Equalassertion {
	
	
	
	@Test
    public void equal(){
		
		String actualResult = "Log in";
		
		 //Setting the property of chrome browser and passing the chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA&Eclipse\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	   //To maximize the web page
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get method used to open url
		driver.get("https://www.facebook.com/login/");
		
		WebElement expectedResult = driver.findElement(By.xpath("//*[contains(text(),'Log in')]"));
		expectedResult.getText();
		
		Assert.assertEquals(actualResult,expectedResult);
		System.out.println("Equal Assertion verified");
		
	}

}
