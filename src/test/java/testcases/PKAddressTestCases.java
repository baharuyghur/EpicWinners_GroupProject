package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.BaseClass;
import utilities.CommonMethods;

import static pages.PKAddressPage.addressButton;

public class PKAddressTestCases extends CommonMethods {


    @Test(priority = 1)
    public void verifyCheckAddressButtonFunctionality() throws InterruptedException {
        addressPage.addressButton.click();
        addressPage.chooseYourLocationBoxShowup();
    }

    @Test(priority = 2)
    public void verifyEnterZipcode() throws InterruptedException {
        addressPage.addressButton.click();
        addressPage.submitZipcode(BaseClass.getProperty("zipcode"));
        CommonMethods.waitForVisibility(addressPage.verifiedZipcode);
        String zipcodeExpected = addressPage.verifiedZipcode.getText();

        Assert.assertEquals(zipcodeExpected, BaseClass.getProperty("zipcode"));
    }

    @Test(priority = 3)
    public void verifyZipcodeOnGlobalHeaderToMatchWithEnteredZipcode() throws InterruptedException {
        addressPage.addressButton.click();
        addressPage.submitZipcode(BaseClass.getProperty("zipcode"));
        addressPage.doneButton.click();
        CommonMethods.wait(2);
        String addressHeader = addressPage.headerZipcode.getText();
        System.out.println(addressHeader);
        String expected = BaseClass.getProperty("zipcode");

        Assert.assertTrue(addressHeader.contains(expected),
                "Address Header should contains " + expected);
    }


    @Test(priority = 4)
    public void verifySignInToSeeYourAddress() {
        addressButton.click();
        addressPage.signIn();
        //addressPage.asserts(BaseClass.getProperty("signinInfoName"), "Hello, Lucia");
    }


    @Test(priority = 5)
    public void verifySelectCountryDropdownButton() throws InterruptedException {
        addressPage.addressButton.click();
//        selectDropDownVisibleText(addressPage.countryOptions, BaseClass.getProperty("country"));
        addressPage.selectCountry(addressPage.countryDropdownButton, addressPage.countryOptions01, "country");

        addressPage.asserts("country", addressPage.actual);
    }

    @AfterMethod
    public void tearDown() {

        BaseClass.closeDriver();
    }
}
