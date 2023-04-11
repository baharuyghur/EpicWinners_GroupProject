package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ClinicPage {

	public ClinicPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	// Click on clinic
	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[2]")
	public WebElement ClinicLink;

	// Click on Find a Treatment
	@FindBy(xpath = "//*[@class=\"link  button button-font-size-regular button-type-tertiary\"]")
	public WebElement FindaTreatmentButton;
	
	// search bar testing
	@FindBy(xpath = "//*[@id=\"nav-bb-search\"]")
	public WebElement SearchBar;
	
	
	//click on sinus infection
	@FindBy(xpath ="//*[@id=\"conditions\"]/div/div[6]/div/div[1]/div[1]/a")
	public WebElement SinusInfectionTab;
	
	//click on select your state 
	@FindBy(xpath ="//*[@id=\"buy-box-desktop\"]")
	public WebElement ClickOnState;
	
	//Select your state
	@FindBy(xpath ="/html/body/div[1]/pui-section/pui-section-column[3]/pui-section[1]/div/div/pui-section/pui-section/pui-dropdown-two/pui-dropdown-item-two[5]")
	public WebElement SelectSate;
	
	//click on Healthtap
	@FindBy(xpath ="/html/body/div[1]/pui-section/pui-section-column[3]/pui-section[2]/div/div/pui-section/pui-section[2]/pui-section[1]")
	public WebElement SelectHealthTap;
	
	//click get started
	@FindBy(xpath ="/html/body/div[1]/pui-section/pui-section-column[3]/pui-section[2]/div/div/pui-section/pui-section[3]/pui-button")
	public WebElement ClickGetStarted;
	
	
	//sign in page for clinic 
	
	
	//ClickonBlank empty box to type email
	@FindBy(xpath ="//*[@id=\"ap_email\"]")
	public WebElement EnterEmail;
	
	//ClickonContinue 
	@FindBy(xpath ="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span")
	public WebElement PressContinue;
	
	//enterPasswordon empty box
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	public WebElement EnterPassword;
	
	//press sign in
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[2]/span")
	public WebElement SelectSignIn;
	
	
	
	//Amazon Clinic Page 
	
	//fill in name
	//@FindBy(xpath="//*[@id=\"first-name-input\"]/span/div")
	//public WebElement FillName;
	
}
