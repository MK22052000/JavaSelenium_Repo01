package java_practice_newone;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotOnFailure1 {
	
	WebDriver driver;
	
	//ITestResult will provide the execution status and test  name 
	
	public void capturescreenshot(ITestResult result) throws Exception {
		if(ITestResult.FAILURE == result.getStatus()) {
			
			//if failure take screenshot interface and type casting
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File Sourcefile = ts.getScreenshotAs(OutputType.FILE);
			
			//Copy the file into specify location 
			File destFolder = new File("./screenshots/"+ result.getName() + ".png");
			
		   FileUtils.copyFile(Sourcefile,destFolder);
			
		   System.out.println(result.getName() + " Method () failed, Screenshot captured " );
		}
	}

}
