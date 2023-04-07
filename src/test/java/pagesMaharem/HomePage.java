package pagesMaharem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;

public class HomePage {
	
	public HomePage() { 
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
 	
	
	//@FindBy(xpath="//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[1]/span[1]")
	@FindBy(xpath="//*[@id='icp-nav-flyout']")
	public WebElement languageChangebutton;
	// language DROP DOWN options 
	
	@FindBy(xpath="//div[@class='nav-coreFlyout nav-flyout'and @id='nav-flyout-icp']")
	 public WebElement dropdownmenu;
	
	
	@FindBy(xpath="//span[@style='unicode-bidi:isolate; direction:ltr;' and @dir='ltr']")
    public List<WebElement> languageDropDown;
	
	@FindBy(xpath="//*[@id=\'nav-link-accountList\']")
		public WebElement signInbutton;

	@FindBy(xpath="//*[@id='nav-flyout-ya-signin']/a/span")
			public WebElement loginbutton;
	
	@FindBy(xpath="//*[@id='ap_email']") 
	public WebElement signinEmailinput;
	
	
	@FindBy(xpath="//*[@id='continue']") 
	
	public WebElement signinEmailsubmitButton;
	
	@FindBy(xpath="//*[@id='ap_password']")
	public WebElement passwordInput;
	
	@FindBy(xpath= "//*[@id='signInSubmit']")
	public WebElement passwordSubmit;
	
	//*[@id="signInSubmit"]

	
	    
	// Locate the desired language option and click on it
	@FindBy(xpath="//*[@id=\"nav-flyout-icp\"]/div[2]/a[1]/span/span[1]")
	public WebElement spanishOption;
	

	
	public void selectLanguage (String language) {
        for (int i = 0; i < languageDropDown.size(); i++) {
            if (languageDropDown.get(i).getText().contains(language)) {
            	//create action object ,one way to click
        Actions actions = new Actions(BaseClass.getDriver());
        actions.moveToElement(languageDropDown.get(i));
         (languageDropDown.get(i)).click();
             break;
            }
        }    
        }
}

	//String selectedLanguage = languageButton.getText();
    
	//String expectedLanguage = "EN";
	        //Assert.assertEquals(selectedLanguage, expectedLanguage); 
	