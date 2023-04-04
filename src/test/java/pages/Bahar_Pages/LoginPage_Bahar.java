package pages.Bahar_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LoginPage_Bahar {
	public  LoginPage_Bahar() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
public WebElement hellosignIn;

@FindBy(xpath="//div[@id='nav-flyout-ya-signin']")
public WebElement signIn;	

}
