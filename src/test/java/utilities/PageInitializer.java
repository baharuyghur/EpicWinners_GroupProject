package utilities;

import pages.PKAddressPage;
import pages.ClinicPage;
import pages.LoginPage;

import pages.Bahar_Pages.LoginPage_Bahar;
import pages.Bahar_Pages.SigninPage_Bahar;
import pagesMaharem.HomePage;

public class PageInitializer extends BaseClass{
	
	public static LoginPage lp;
	public static PKAddressPage addressPage;
	public static LoginPage_Bahar lpb;
	public static SigninPage_Bahar spb;
	public static HomePage hp;
	public static ClinicPage cp;


	public static void initialize() {
		lp = new LoginPage();
		addressPage = new PKAddressPage();
		lpb = new LoginPage_Bahar();
		spb=new SigninPage_Bahar();
    hp= new HomePage();
    cp= new ClinicPage();
	}
}
