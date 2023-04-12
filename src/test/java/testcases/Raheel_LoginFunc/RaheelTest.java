package testcases.Raheel_LoginFunc;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class RaheelTest extends CommonMethods {

	
//	Hover over sing in
//	click on sign in
//	type email : epicwinners01@gmail.com
//	type password: techcircle
//	skip the sing in with out a password prompt
//	Verify that a user can successfully log in with valid credentials

	  @Test(priority = 1)
	    public void verifyUserCanLogin() throws InterruptedException {
		  WebElement loginButton = BaseClass.getDriver().findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		  hover(loginButton);
		  Thread.sleep(5000);
		  BaseClass.getDriver().findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a")).click();
		  BaseClass.getDriver().findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(BaseClass.getProperty("email"));
		  BaseClass.getDriver().findElement(By.xpath("//*[@id=\"continue\"]")).click();
		  BaseClass.getDriver().findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(BaseClass.getProperty("password"));
		  BaseClass.getDriver().findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		  
	  }
		  
	 @Test (priority = 2)
	  public void verifyLoginWithInvalidPassword () throws InterruptedException {
		 WebElement loginButton = BaseClass.getDriver().findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		  hover(loginButton);
		 Thread.sleep(5000);
		 BaseClass.getDriver().findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a")).click();
		  BaseClass.getDriver().findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(BaseClass.getProperty("email"));
		  BaseClass.getDriver().findElement(By.xpath("//*[@id=\"continue\"]")).click();
		  BaseClass.getDriver().findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(BaseClass.getProperty("techcircle123"));
		  BaseClass.getDriver().findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click(); 
	
	 }
	 @Test (priority = 3)
	  public void  verifyLogoutSuccesfully () throws InterruptedException {
		  
		 WebElement loginButton = BaseClass.getDriver().findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		  hover(loginButton);
		  Thread.sleep(5000);
		  BaseClass.getDriver().findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a")).click();
		  BaseClass.getDriver().findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(BaseClass.getProperty("email"));
		  BaseClass.getDriver().findElement(By.xpath("//*[@id=\"continue\"]")).click();
		  BaseClass.getDriver().findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(BaseClass.getProperty("password"));
	 
		  
		  
	 
		  
		  
		  
		  
	    }

//	    @AfterMethod
//	    public void tearDown() {
//	        BaseClass.closeDriver();
//	    }
}
