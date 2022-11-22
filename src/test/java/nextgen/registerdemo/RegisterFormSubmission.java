package nextgen.registerdemo;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterFormSubmission {
	
	
	@BeforeMethod
	public void launchTheBrowser() {
		System.out.println("Browser launched successfully");
		Reporter.log("Browser launched successfully");
	}
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Browser closed");
		Reporter.log("Browser closed successfully");
	}
	
	
	
	@Test
	public void launchapplication() {
		System.out.println("Application launched successfully");
		Reporter.log("Application launched successfully");
	}
	
	
	
	
	
	

}
