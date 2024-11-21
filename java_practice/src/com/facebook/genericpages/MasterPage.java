package com.facebook.genericpages;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {

	
	  public static WebDriver driver;
	  public static  Properties prop;
	  public static Properties LOC;
	  public static  Properties td;
	  
	  //Constructor implementation
	  
	  public MasterPage() throws Exception {
		  
		  //implement configuration properties file
		  
		  FileInputStream FIS1 = new  FileInputStream("C:\\Users\\Megha keerthi R\\eclipse-workspace\\java_practice\\Repository\\Config.properties");
		  prop = new Properties();
		  prop.load(FIS1);
		  
		  
		  //implement Location properties file

		  FileInputStream FIS2 = new  FileInputStream("C:\\Users\\Megha keerthi R\\eclipse-workspace\\java_practice\\Repository\\locators.properties");
		  LOC = new Properties();
		  LOC.load(FIS2);
		  
		  
		  //implement testdata properties file
		  
		  FileInputStream FIS3 = new  FileInputStream("C:\\Users\\Megha keerthi R\\eclipse-workspace\\java_practice\\Repository\\Testdata.properties");
		  td = new Properties();
		  td.load(FIS3);
		  
		  //Added latest webdriver manager into pom.xml file 
		  
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
		}
		  
		  else if(prop.getProperty("browser").equalsIgnoreCase("edge")){
			  WebDriverManager.edgedriver().setup();
			  driver = new EdgeDriver();
			  
		  }
		  else if(prop.getProperty("browser").equalsIgnoreCase("ie")){
			  WebDriverManager.iedriver().setup();
			  driver = new InternetExplorerDriver();
		  }
		  else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
			  WebDriverManager.firefoxdriver().setup();
			  driver = new FirefoxDriver();
		  }
		  else {
			  System.out.println("No details found");
		  }
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  Thread.sleep(2000);
		  driver.get(prop.getProperty("url")); 
		  
		  
		  
	  }

	
	  
	
}
