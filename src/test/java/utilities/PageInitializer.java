package utilities;


import pages.Bahar_Pages.LoginPage_Bahar;
import pages.Bahar_Pages.SigninPage_Bahar;
import pagesMaharem.HomePage;

public class PageInitializer extends BaseClass{
	
	public static LoginPage_Bahar lpb;
	public static SigninPage_Bahar spb;
	public static HomePage hp;
	

public static void initialize() {
	lpb = new LoginPage_Bahar();
	spb=new SigninPage_Bahar();
	
}

}