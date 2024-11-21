package java_practice_newone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 {
	
	
	TakeScreenshotOnFailure1 t1 = new TakeScreenshotOnFailure1();
	
	@Test
	public void dologin() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA&Eclipse\\chromedriver.exe");
		t1.driver = new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		t1.driver.get("https://www.facebook.com/");
		
		WebElement mail = t1.driver.findElement(By.xpath("//*[@id='email']"));
		mail.sendKeys("megha");
		WebElement pass = t1.driver.findElement(By.xpath("//*[@id='passs']"));
		pass.sendKeys("12345");
	}

	@AfterMethod
	public void takescreenshot(ITestResult result) throws Exception {
		t1.capturescreenshot(result);
	}

}
