package testcases.Luci_clinicFunctionality;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class ClinicTest extends CommonMethods {

	// @BeforeMethod
	// public void beforeTest() {
	// BaseClass.getDriver();

	@Test(priority = 1)
	public void clickOnClinic() {
		cp.ClinicLink.click();

	}

	@Test(priority = 2)
	public void findAtreatment() {
		cp.ClinicLink.click();
		cp.FindaTreatmentButton.click();

	}

	@Test(priority = 3)
	public void testSearchbar() {
		cp.ClinicLink.click();
		cp.SearchBar.sendKeys("notepad");
		cp.SearchBar.sendKeys("vitamin c");

	}

	@Test(priority = 4)
	public void getTreated() {
		cp.ClinicLink.click();
		cp.FindaTreatmentButton.click();
		cp.SinusInfectionTab.click();
		cp.ClickOnState.click();
		cp.SelectSate.click();
		cp.SelectHealthTap.click();
		cp.ClickGetStarted.click();

	}

	@Test(priority = 4)
	public void logintogettreated() {
		cp.ClinicLink.click();
		cp.FindaTreatmentButton.click();
		cp.SinusInfectionTab.click();
		cp.ClickOnState.click();
		cp.SelectSate.click();
		cp.SelectHealthTap.click();
		cp.ClickGetStarted.click();
		cp.EnterEmail.sendKeys("epicwinners01@gmail.com");
		cp.PressContinue.click();
		cp.EnterPassword.sendKeys("techcircle");
		cp.SelectSignIn.click();
		
	}
		//prompts to enter password again with security keys
		//doing this manually to save time :D
		
		
		@Test(priority = 5)
		public void Fillinform() {
			cp.ClinicLink.click();
			cp.FindaTreatmentButton.click();
			cp.SinusInfectionTab.click();
			cp.ClickOnState.click();
			cp.SelectSate.click();
			cp.SelectHealthTap.click();
			cp.ClickGetStarted.click();
			cp.EnterEmail.sendKeys("epicwinners01@gmail.com");
			cp.PressContinue.click();
			cp.EnterPassword.sendKeys("techcircle");
			cp.SelectSignIn.click();
			
			
			//cp.FillFirstName.sendKeys("Maria Nao");
			//cp.Fill2ndName.sendKeys("Nao");
			//cp.FillLastname.sendKeys("Mayo");
	}

	@AfterMethod
	public void tearDown() {
		BaseClass.closeDriver();

	}

}
