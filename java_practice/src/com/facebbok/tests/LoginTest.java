package com.facebbok.tests;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;

import com.facebook.genericpages.MasterPage;
import com.facebook.pages.LoginPage;

public class LoginTest {
	
	
	
	@Test
	public void LoginTest1() throws Exception{
		
		LoginPage lp = new LoginPage();
	
		
		lp.ClickEmail();
		
		lp.TextOfWebElemement();
		
		Thread.sleep(2000);
		lp.enterEmail();
		
		lp.enterpassword();
		
		Thread.sleep(2000);
		lp.clearEmail();
		
		lp.ReadExcelData("Email",2 ,1);
		Thread.sleep(2000);
		lp.clearpassword();
		lp.ReadExcelData("Password",2 ,2);
		Thread.sleep(2000);
		lp.clearEmail();
		Thread.sleep(2000);
		lp.clearpassword();
		
	
		
		
		
		
	}
	


	

}
