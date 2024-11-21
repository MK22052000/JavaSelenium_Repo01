package java_practice_newone;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
 import org.openqa.selenium.chrome.ChromeDriver;
 
public class Checkbox {

	public static void main(String[] args) throws Exception {
		
		 //Setting the property of chrome browser and passing the chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		
		//Wait for given time
		Thread.sleep(2000);
		
		//get method used to open url
		driver.get("https://www.instagram.com/");
		
		//To maximize the web page
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("_megha_keerthi_r");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("Setupati@22");
		

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
		

	}

}
