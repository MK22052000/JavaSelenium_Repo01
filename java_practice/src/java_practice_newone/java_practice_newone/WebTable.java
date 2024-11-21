package java_practice_newone;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		 //Setting the property of chrome browser and passing the chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	   //To maximize the web page
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get method used to open url
		driver.get("https://money.rediff.com/gainers");
		
		//create list of all companies
		List<WebElement> CompaniesList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total companies : "+CompaniesList.size());
	
	

	//create list of all currentprice
	List<WebElement> CurrentpriceList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	System.out.println("Total currentprice : "+CurrentpriceList.size());
	
	
	   String expResult = "Innocorp";
	   
	   for(int i=0; i < CompaniesList.size(); i++) {
		   if(CompaniesList.get(i).getText().equalsIgnoreCase(expResult)) {
			   
			   System.out.println(CompaniesList.get(i).getText()+" = "+CurrentpriceList.get(i).getText());
			   CompaniesList.get(i).click();
			   System.out.println(driver.getTitle());
			   break;
			
	   }
	   }
	}
}




