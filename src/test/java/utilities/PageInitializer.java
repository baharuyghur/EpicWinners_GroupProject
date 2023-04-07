package utilities;

import pages.ClinicPage;
import pages.LoginPage;

public class PageInitializer extends BaseClass {

	public static LoginPage lp;
	public static ClinicPage cp;

public static void initialize() {
	lp = new LoginPage();
	cp = new ClinicPage();
}
}