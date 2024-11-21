package com.facebook.genericpages;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.log4testng.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonMethods extends MasterPage {

	public CommonMethods() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//get Text of webelement
	public void getTextOfWebElement(String xpathkey) {
		String getTextOfWebElement = driver.findElement(By.xpath(LOC.getProperty(xpathkey))).getText();
		System.out.println(getTextOfWebElement);
	}
	//click web element method  
	public void clickWebElement(String xpathkey) {
		driver.findElement(By.xpath(LOC.getProperty(xpathkey))).click();
		}
    //clear web element method  
		public void clearWebElement(String xpathkey) {
			driver.findElement(By.xpath(LOC.getProperty(xpathkey))).clear();
		}
	 //EnterData
	  public void enterData(String xpathkey, String testdata) {
	     driver.findElement(By.xpath(LOC.getProperty(xpathkey))).sendKeys(td.getProperty(testdata));
	  }  
	//Mouse hover
	  public void moveToElement(String xpathkey) {
		  Actions act = new Actions(driver);
	     act.moveToElement(driver.findElement(By.xpath(LOC.getProperty(xpathkey)))).build().perform();
	  }
	  //Select Dropdown value by visible Text
	  public void selectByVisibleText(String xpathkey,String testdata) {
		
	     WebElement ele = driver.findElement(By.xpath(LOC.getProperty(xpathkey)));
	     Select web= new Select(ele);
	      web.selectByVisibleText(td.getProperty(testdata));
	     
	  }
	  
	  //Reading Excel data
	  public void ReadExcelData(String xpathkey,int rowNo,int ColumnNo)throws Exception {
		  
		  File src = new File("C:\\Users\\Megha keerthi R\\eclipse-workspace\\java_practice\\src\\com\\facebbok\\resources\\Excel_Use.xlsx");
		  FileInputStream fis = new FileInputStream(src);
		  XSSFWorkbook wbook = new XSSFWorkbook(fis);
		  XSSFSheet  sh = wbook.getSheet(prop.getProperty("ExcelTestDataSheetName"));
		  System.out.println(sh.getSheetName());
		  String abcd = sh.getRow(rowNo).getCell(ColumnNo).getStringCellValue();
		  
		  driver.findElement(By.xpath(LOC.getProperty(xpathkey))).sendKeys(abcd);
		  
	}
	  
	  
	  
	  
	  
	  
	
}