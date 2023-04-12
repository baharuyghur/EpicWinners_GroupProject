package testcases.Luci_clinicFunctionality;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class ClinicTestAllTogether extends CommonMethods {
	

	@BeforeMethod
	public void beforeTest() {
		BaseClass.getDriver();
	}

	@Test
	public void ClickOnClinic() {
		cp.ClinicLink.click();
		cp.FindaTreatmentButton.click();
		cp.SearchBar.sendKeys("notepad");
		cp.SinusInfectionTab.click();
		cp.ClickOnState.click();
		cp.SelectSate.click();
		cp.SelectHealthTap.click();
		cp.ClickGetStarted.click();
		cp.EnterEmail.sendKeys("epicwinners01@gmail.com");
		cp.PressContinue.click();
		cp.EnterPassword.sendKeys("techcircle");
		cp.SelectSignIn.click();
		
		// prompts to enter password again with security keys
			
		
		//cp.FillFirstName.sendKeys("Maria");
		//cp.Fill2ndName.sendKeys("Nao");
		//cp.FillLastname.sendKeys("Mayo");

	
	}

}
