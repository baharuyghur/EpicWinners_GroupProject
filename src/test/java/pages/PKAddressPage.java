package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import utilities.BaseClass;
import utilities.CommonMethods;

import java.util.List;

public class PKAddressPage {
    public PKAddressPage() {

        PageFactory.initElements(BaseClass.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id='nav-global-location-popover-link']")
    public static WebElement addressButton;

    @FindBy(xpath = "//input[(@class='GLUX_Full_Width a-declarative')]")
    public WebElement zipcodeInputBox;

    @FindBy(xpath = "//span/span[contains(@data-action,'GLUXPostalUpdateAction')]")
    public WebElement applyButton;

    @FindBy(xpath = "//span/button[@class=('a-button-text')]")
    public WebElement doneButton;

    @FindBy(xpath = "//span[@id=('glow-ingress-line2')]")
    public WebElement confirmDeliverToAddress;//wrong locator?

    @FindBy(xpath = "//h4[@id=('a-popover-header-1')]")
    public WebElement chooseYourLocationHeader;

    @FindBy(css = "span.a-text-bold")
    // span[contains(@class, "a-text-bold")   <--- xpath
    public WebElement verifiedZipcode;

    @FindBy(xpath = "//span[@role ='radiogroup']")
    public WebElement countryDropdownButton;

    @FindBy(xpath = "//*[contains(@class,'a-dropdown-item')]")
    public WebElement countryOptions;

    @FindBy(xpath = "//*[contains(@class,'a-dropdown-item')]")
    public List <WebElement> countryOptions01;

    @FindBy(css = "#glow-ingress-block > span:nth-child(2)")
    public WebElement headerZipcode;

    @FindBy(xpath = "//span[@id = 'GLUXSignInButton']/span")
    public WebElement signInToSeeYourAddressButton;

    @FindBy(xpath = "//input[@id = 'ap_email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id = 'continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@id = 'ap_password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//span[@id = 'auth-signin-button']")
    public WebElement signinButton;

    @FindBy (id = "nav-link-accountList-nav-line-1")
    public WebElement signinConfirmedName;


    public static void selectYourAddressButton() {

        addressButton.click();
    }

    public void chooseYourLocationBoxShowup() {
        String chooseYourLocation = chooseYourLocationHeader.getText();
        Assert.assertEquals("Choose your location", chooseYourLocation);
    }

    public void submitZipcode(String zipcode) throws InterruptedException {
        zipcodeInputBox.sendKeys(zipcode);
        Thread.sleep(1000);
        applyButton.click();
    }

    public void clickCountryDropdownButton(String countryFromFile) {
        countryDropdownButton.click();
        CommonMethods.wait(2);
        countryOptions.findElement(By.linkText(String.valueOf(countryOptions))).click();
        CommonMethods.wait(2);
    }

    public void signIn() {
        signInToSeeYourAddressButton.click();
        emailBox.sendKeys(BaseClass.getProperty("email"));
        continueButton.click();
        passwordBox.sendKeys(BaseClass.getProperty("password"));
        signinButton.click();
    }

//    public String getZipcode() {
//        String addressConfrimation = confirmDeliverToAddress.getText();
//        String zipCode = addressConfrimation.split("\\s")[2];
//        System.out.println("Before split" + addressConfrimation);
//        System.out.println("After split" + zipCode);
//        return zipCode;
//    }
 public static String actual;
    public void selectCountry(WebElement element,List <WebElement> elements, String country){
        CommonMethods.waitForClickability(element).click();
        for(WebElement el : elements){
            if(el.getText().toLowerCase().trim().contains(BaseClass.getProperty(country))){
                actual  = el.getText().toLowerCase().trim();
                CommonMethods.waitForClickability(el).click();
                CommonMethods.wait(3);
                break;
            }
        }
    }

    public void asserts(String expected, String actual){
        Assert.assertEquals(actual, (BaseClass.getProperty(expected)));

    }

}


