package java_practice_newone;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ReadExcelfile {

	public static void main(String[] args) throws Exception  {
		
		//Specify the Locatipon of excel file 
		File src = new File("C:\\Users\\Megha keerthi R\\Downloads\\PMJJBY-Functional.xlsx");
		
		//Load file 
		FileInputStream fis = new FileInputStream(src);
		
		//Load Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Load Worksheet
		XSSFSheet sheet1 = wb.getSheet("AdditionalTest Cases");
		
		//print the loaded sheet name 
		System.out.println(sheet1.getSheetName());
		
		//print the from excel sheet 
		
		System.out.println(sheet1.getRow(1).getCell(5).getStringCellValue());
		
		//print float/double  value 
		//System.out.println(sheet1.getRow(1).getCell(3).getNumericCellValue());
		
		//print Integer  value 
				//System.out.println((int)sheet1.getRow(1).getCell(3).getNumericCellValue());//to print integer value  use (int) front to worksheet ref 
				
				//print total number of rows - 1st way 
				System.out.println("Total No.of.Rows : "+sheet1.getPhysicalNumberOfRows());
				//print total number of rows - 1st way 
				System.out.println("Total No.of.Rows : "+(sheet1.getLastRowNum() +1));
				
				//print total number of Columns - 1st way 
				System.out.println("Total No.of.Columns : "+sheet1.getRow(1).getPhysicalNumberOfCells());
				//print total number of rows - 1st way 
				System.out.println("Total No.of.Columns : "+(sheet1.getRow(1).getLastCellNum()));//it willnot return index , it will return size
				
				
				System.setProperty("webdriver.chrome.driver", "D:\\JAVA&Eclipse\\chromedriver.exe");
				
				//Launching chrome browser instance	
					WebDriver driver = new ChromeDriver();
					
					
					//Wait for given time
					Thread.sleep(2000);
					
					//get method used to open url
					driver.get("https://www.facebook.com/login/");
					
					//To maximize the web page
					driver.manage().window().maximize();
					
					
					int abc = sheet1.getRow(1).getPhysicalNumberOfCells();
					short abc1 = sheet1.getRow(1).getLastCellNum();
					
					driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anbu");
					driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("panbu");
					

	}

}
