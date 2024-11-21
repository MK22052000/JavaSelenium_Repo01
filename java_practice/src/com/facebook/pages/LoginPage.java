package com.facebook.pages;



import com.facebook.genericpages.CommonMethods;

public class LoginPage extends CommonMethods {

	public LoginPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Click email
	public void ClickEmail() {
		clickWebElement("Email");
	
	}



		//enter email
		public void enterEmail() {
			enterData("Email", "Testdata1");
		
		}
		
		//enter Password
		public void enterpassword() {
			enterData("Password", "Testdata2");
		
		}
				
		//ClearEmail
		public void clearEmail() {
			clearWebElement("Email");
			
		}
		
		//Clearpassword
		public void clearpassword() {
			clearWebElement("Password");
			
		}
		
		//GetTextWebElement
		public void TextOfWebElemement() {
			getTextOfWebElement("Loginintofacebooktext");
			
		}
		
		//read exceldata
		public void readexcel() {
			ReadExcelData("Email",2 ,1);
		}
		
		
		
		
		

}
