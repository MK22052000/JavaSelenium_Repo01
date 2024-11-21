package java_practice_newone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scrollup {

	public static void main(String[] args) {
		
		//Setting the property of chrome browser and passing the chromedriver path
				System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\chromedriver.exe");
			     WebDriver driver = new ChromeDriver();
			   //To maximize the web page
					driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//get method used to open url
				driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
	}

}
