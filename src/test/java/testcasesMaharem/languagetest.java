package testcasesMaharem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import utilities.BaseClass;
import utilities.CommonMethods;

public class languagetest extends CommonMethods{
	


	@Test
	public void VerifyLanguageChange() throws InterruptedException {
		
	  	//hover over language tab
    	//click on the language tab and verify a dropdown menu with language options is displayed 
    	//select espanol from the drop down menu and verify the website content changes to the selected language
    	//repeat steps 1-3 with English and verify the website content changes to English
		
		
		hover(hp.languageChangebutton);
		
		Thread.sleep(2000);
		Assert.assertTrue(hp.dropdownmenu.isDisplayed(), BaseClass.getProperty("dropdownErrormsg"));
		hp.selectLanguage("ES");
		Thread.sleep(2000);
	  	//verify the website content has changed to spanish
		Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains(BaseClass.getProperty("spanishURL"))); }
		
	@Ignore 
	@Test
	public void VerifyLanguageChange2() throws InterruptedException {
			
			hover(hp.languageChangebutton);
			Thread.sleep(2000); 
			Assert.assertTrue(hp.dropdownmenu.isDisplayed(), "dropdownErrormsg");
			hp.selectLanguage("arabic");
			Thread.sleep(2000);  
			//verify the website content has changed to arabic
			Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("arabicURL"));		
			hover(hp.signInbutton);
			Thread.sleep(2000);
			hp.loginbutton.click();
			Assert.assertEquals(hp.loginemailPAGEtext.getText(), BaseClass.getProperty("arabictext1"));
			hp.signinEmailinput.sendKeys(BaseClass.getProperty("email"));	
			Thread.sleep(2000);
			hp.signinEmailsubmitButton.click();
			Assert.assertEquals(hp.passwordPAGEtext.getText(), BaseClass.getProperty("arabictext2"));
			Thread.sleep(2000);
			hp.passwordInput.sendKeys(BaseClass.getProperty("password"));	
			Thread.sleep(2000);
			hp.passwordSubmit.click();
			//verify the website content is still arabic
			Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("arabicURL"));
	}
	
	 //Go to : https://www.amazon.com/
		//Hover over language tab
		//Click on the language tab and verify that a drop-down menu with language options is displayed.
		//Select a language of your choice that you understand from the drop-down menu and verify that the website content changes to the selected language.
		// Now Select english from the drop-down menu and verify that the website content changes back to english.
	@Ignore
	@Test
	public void VerifyLanguageChange3() throws InterruptedException {
	
		hover(hp.languageChangebutton);
		Thread.sleep(1000); 
		Assert.assertTrue(hp.dropdownmenu.isDisplayed(), "dropdownErrormsg");
		Thread.sleep(1000); 
		hp.selectLanguage((BaseClass.getProperty("arabic")));
		//verify the website content has changed to arabic
		Thread.sleep(1000); 
	//	Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("arabicURL"));	
		hover(hp.languageChangebutton);
		//hp.ARABIClanguageChangebutton.click();	
		hp.selectLanguage("EN");
		Thread.sleep(1000); 
		//String currentUrl = BaseClass.getDriver().getCurrentUrl();
		//System.out.println(currentUrl);
		Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains(BaseClass.getProperty("englishURL")));
		
	}
}
	
	
//*[@id="icp-nav-flyout"]

