package java_practice_newone;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizeDataprovider {

	
	WebDriver driver;
	
	@BeforeClass
	public void SetEnv() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA&Eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@DataProvider
	public Object[][] dataset() throws Exception {
		File src3 = new File("C:\\Users\\Megha keerthi R\\eclipse-workspace\\java_practice\\Repository\\Testdata.properties");
		
		//Create File input stream class object to load file 
		FileInputStream fis2 = new FileInputStream(src3);
		
		//create properties class object to read properties file 
		Properties pro3 = new Properties();
		pro3.load(fis2);
		
		Object arr[][] = new Object[3][2];
		
		arr[0][0] = pro3.getProperty("Testdata1");
		arr[0][1] = pro3.getProperty("Testdata2");
		
		arr[1][0] = "Testdata2";
		arr[1][1] = "Testdata2";
		
		arr[2][0] = "Testdata3";
		arr[2][1] = "Testdata3";
		
		return arr;
		
	}
	
	
	@Test(dataProvider = "dataset")
	public void enterdata(String username, String password) throws Exception{
		
		Thread.sleep(2000);
		WebElement Megha = driver.findElement(By.xpath("//*[@id='email']"));
		Megha.clear();
		Thread.sleep(2000);
		WebElement Megha1 = driver.findElement(By.xpath("//*[@id='pass']"));
		Megha1.clear();
		WebElement User  = driver.findElement(By.xpath("//*[@id='email']"));
		User.sendKeys(username);
		Thread.sleep(2000);
		WebElement pass  = driver.findElement(By.xpath("//*[@id='pass']"));
		pass.sendKeys(password);
	}
	
}
