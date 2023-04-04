package pages.Bahar_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class SigninPage_Bahar {
	
		public  SigninPage_Bahar() {
			PageFactory.initElements(BaseClass.getDriver(), this);
		}
		
		
	@FindBy(xpath="//*[contains(text(),'Email or mobile phone number')]")
	public WebElement emailOrMobile;
	
	@FindBy(xpath="//*[contains(text(),'Password')]")
	public WebElement passwordText;
	
	@FindBy(xpath="//*[contains(text(),'Hello')]")
	public WebElement helloText;
	
		
	@FindBy(xpath="//input[@id='ap_email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='continue']")
	public WebElement continueButton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	public WebElement signInSubmit;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement searchbox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	public WebElement searchlogo;
	
	@FindBy(xpath="//span[@class='a-color-state a-text-bold']")
	public WebElement umbrella;
	
	@FindBy(xpath="//span[@class='a-color-state a-text-bold']")
	public WebElement Item6868;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']")
	public WebElement Id;
	
	@FindBy(xpath="//select[@id='s-result-sort-select']")
	public WebElement sortbyDrodown;
	
	@FindBy(xpath="//a[@id='s-result-sort-select_1']")
	public WebElement lowToHigh;
	
	@FindBy(xpath="//*[contains(text(), 'Price: Low to High')]")
	public WebElement sortbyLowtoHigh;
	
	@FindBy(xpath="//*[contains(text(), 'Price: High to Low')]")
	public WebElement sortbyHighToLow;
	
	@FindBy(xpath="//div[@data-csa-c-item-id='amzn1.asin.1.B09FJN5R5C']")
	public WebElement image;
	
	@FindBy(xpath="//*[contains(text(),'Featured')]")
	public WebElement featuredText;
	
	
	

	
	
	
	
	
	
	
	
}
