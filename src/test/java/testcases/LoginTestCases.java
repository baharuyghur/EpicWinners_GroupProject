package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;


public class LoginTestCases extends CommonMethods{
	
	@Test
	public void loginSuccessfully()  {
		

	
	}
	@AfterTest
	public void teatDown() {
		BaseClass.closeDriver();
	}
}
	
	
	
	
	
	
	
	
