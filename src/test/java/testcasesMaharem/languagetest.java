package testcasesMaharem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class languagetest extends CommonMethods{
	

	@Ignore
	@Test
	public void VerifyLanguageChange() throws InterruptedException {
		
	  	//hover over language tab
    	//click on the language tab and verify a dropdown menu with language options is displayed 
    	//select espanol from the drop down menu and verify the website content changes to the selected language
    	//repeat steps 1-3 with English and verify the website content changes to English
		
		
		hover(hp.languageChangebutton);
		
		Thread.sleep(2000);
		  Assert.assertTrue(hp.dropdownmenu.isDisplayed(), "The dropdown menu is not displayed");
		hp.selectLanguage("ES");
		Thread.sleep(2000);
		// Verify that the dropdown menu is visible
	  
	    //verify the website content has changed to spanish
		Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("language=es")); }
		
		//Go to : https://www.amazon.com/
		//	Hover over language tab
		//	Click on the language tab and verify that a drop-down menu with language options is displayed.
//			Select a language of your choice that you understand from the drop-down menu and verify that the website content changes to the selected language.

//		
	    
	@Test
		public void VerifyLanguageChange2() throws InterruptedException {
			
			hover(hp.languageChangebutton);
			Thread.sleep(2000); 
			 Assert.assertTrue(hp.dropdownmenu.isDisplayed(), "The dropdown menu is not displayed");
			
			 
			hp.selectLanguage("AR");
			
			Thread.sleep(2000);  
		
			 //verify the website content has changed to arabic
			Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("language=ar"));
//			Hover over sing in
//			click on sign in
//			type email : epicwinners01@gmail.com
//			type password: techcircle
//			skip the sing in with out a password prompt
//			verify that the language selected is persistent remembered even after navigating to logging.		
		hover(hp.signInbutton);
		Thread.sleep(2000);
		hp.loginbutton.click();
		
		hp.signinEmailinput.sendKeys(BaseClass.getProperty("email"));	
		Thread.sleep(2000);
		hp.signinEmailsubmitButton.click();
		Thread.sleep(2000);
		hp.passwordInput.sendKeys(BaseClass.getProperty("password"));	
		Thread.sleep(2000);
		hp.passwordSubmit.click();
		//verify the website content is still arabic
		Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("language=ar"));
	}
			
	}
	
	


