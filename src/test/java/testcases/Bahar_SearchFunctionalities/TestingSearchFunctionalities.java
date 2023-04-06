package testcases.Bahar_SearchFunctionalities;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.BaseClass;
import utilities.CommonMethods;

public class TestingSearchFunctionalities extends CommonMethods {

		@Test(priority=1)
		public void VerifyUserCanGetSearchResultsWhenUserEntersValidProductKeywordInSearchBox() {

			hover(lpb.hellosignIn);
			lpb.signIn.click();
			Assert.assertEquals(spb.emailOrMobile.getText(), BaseClass.getProperty("object4"));
			sendText(spb.email,BaseClass.getProperty("email"));
			spb.continueButton.click();
			Assert.assertEquals(spb.passwordText.getText(), "Password");
			sendText(spb.password,BaseClass.getProperty("password"));
			spb.signInSubmit.click();
			Assert.assertEquals(spb.helloText.getText(), BaseClass.getProperty("object5"));
			spb.searchbox.click();
			sendText(spb.searchbox,BaseClass.getProperty("object1"));
			spb.searchlogo.click();
			Assert.assertTrue(spb.umbrella.getText().contains(BaseClass.getProperty("object1")));
		}

		@Test(priority=2)
		public void VerifyUserCanEnterOnlyNumericCharactersOrNot() {

			hover(lpb.hellosignIn);
			lpb.signIn.click();
			Assert.assertEquals(spb.emailOrMobile.getText(), BaseClass.getProperty("object4"));
			sendText(spb.email,BaseClass.getProperty("email"));
			spb.continueButton.click();
			Assert.assertEquals(spb.passwordText.getText(), "Password");
			sendText(spb.password,BaseClass.getProperty("password"));
			spb.signInSubmit.click();
			Assert.assertEquals(spb.helloText.getText(), BaseClass.getProperty("object5"));
			spb.searchbox.click();
			sendText(spb.searchbox,BaseClass.getProperty("object3"));
			spb.searchlogo.click();
			Assert.assertTrue(spb.Item6868.getText().contains(BaseClass.getProperty("object3")));
		}

		@Test(priority=3)
		public void VerifyUserCanGetSearchResultsWhenUserEntersValidProductIdISearchBox() {
			hover(lpb.hellosignIn);
			lpb.signIn.click();
			Assert.assertEquals(spb.emailOrMobile.getText(), BaseClass.getProperty("object4"));
			sendText(spb.email,BaseClass.getProperty("email"));
			spb.continueButton.click();
			Assert.assertEquals(spb.passwordText.getText(), "Password");
			sendText(spb.password,BaseClass.getProperty("password"));
			spb.signInSubmit.click();
			Assert.assertEquals(spb.helloText.getText(), BaseClass.getProperty("object5"));
			spb.searchbox.click();
			sendText(spb.searchbox,BaseClass.getProperty("object2"));
			spb.searchlogo.click();
			Assert.assertTrue(spb.Id.getText().contains(BaseClass.getProperty("object2")));
			Assert.assertTrue(spb.image.isDisplayed()); 
	
		   
		}
		
		@Test(priority=4)
		public void VerifyPriceDropdownFunctionality() {
			hover(lpb.hellosignIn);
			lpb.signIn.click();
			Assert.assertEquals(spb.emailOrMobile.getText(), BaseClass.getProperty("object4"));
			sendText(spb.email,BaseClass.getProperty("email"));
			spb.continueButton.click();
			Assert.assertEquals(spb.passwordText.getText(), "Password");
			sendText(spb.password,BaseClass.getProperty("password"));
			spb.signInSubmit.click();
			Assert.assertEquals(spb.helloText.getText(), BaseClass.getProperty("object5"));
			spb.searchbox.click();
			sendText(spb.searchbox,BaseClass.getProperty("object1"));
			spb.searchlogo.click();
			Assert.assertTrue(spb.umbrella.getText().contains(BaseClass.getProperty("object1")));
			selectDropDownVisibleText(spb.sortbyDrodown, BaseClass.getProperty("object6"));
			jsClick(spb.sortbyDrodown);
			Assert.assertEquals(spb.featuredText.getText(),"Featured");
			selectDropDownVisibleText(spb.sortbyDrodown, BaseClass.getProperty("object7"));
		    spb.lowToHigh.click();
			Assert.assertEquals(spb.sortbyLowtoHigh.getText(), BaseClass.getProperty("object7"));
			Assert.assertTrue(spb.sortbyHighToLow.isDisplayed());
			
			//Git practice with Bill

		}
		
		//@AfterMethod
		public void tearDown() {
			BaseClass.closeDriver();
		}
	}


