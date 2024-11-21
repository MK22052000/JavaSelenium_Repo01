
package java_practice_newone;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Zomat {

	public static void main(String[] args) throws Exception{
		
		//Radio buttons operating on facebook login page
		
		 //Setting the property of chrome browser and passing the chromedriver path
				System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\chromedriver.exe");
				
			//Launching chrome browser instance	
				WebDriver driver = new ChromeDriver();
				
				
				//Wait for given time
				Thread.sleep(2000);
				
				//get method used to open url
				driver.get("https://www.facebook.com/login.php/");
				
				//To maximize the web page
				driver.manage().window().maximize();
				
				//Click at login button
				Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		//1st way
		//click gender options
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).click();//female
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();//custom
		
		//2ndway
		Thread.sleep(2000);
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radios.get(2).isSelected());
		System.out.println(radios.get(2).isEnabled());
		radios.get(1).click();
		System.out.println(radios.get(1).isSelected());
		
		
		//3rd way loop
		Thread.sleep(2000);
		List<WebElement> radiosText = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total radios button text : "+ radiosText.size());
		String expresult = "Custom";
		
		for(int i=0;i<radiosText.size();i++) {
			
			if(radiosText.get(i).getText().equalsIgnoreCase(expresult)) {
				radiosText.get(i).click();
			}
			System.out.println(expresult +"Clicked");
			
			}
		}
	


}
