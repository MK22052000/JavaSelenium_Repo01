package java_practice_newone;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRadiobutton {

	
		public static void main(String[] args) throws Exception {

			 //Setting the property of chrome browser and passing the chromedriver path
			System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\chromedriver.exe");
		     WebDriver driver = new ChromeDriver();
		   //To maximize the web page
				driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//get method used to open url
			driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
			
			//select dropdown 
			
			List<WebElement> radio = driver.findElements(By.xpath("//select[@id='day']/option"));
			System.out.println("Total dropdown values : "+radio.size());
			
			String expResult = "4";
			for(int i = 0; i< radio.size();i++) {
				if(radio.get(i).getText().equalsIgnoreCase(expResult)) {
					
			       radio.get(i).click();
				}
			}

	}

}
