package java_practice_newone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable_element {

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
		driver.get("https://jqueryui.com/draggable/");
		
		//switch the frame
		driver.switchTo().frame(0);//pass index of frame
		System.out.println("Frame switched");
		
		//Draggable web element
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		//using action class
		Actions megha = new Actions(driver);
		megha.dragAndDropBy(drag, 150, 100).build().perform();
		
		

	}

}
