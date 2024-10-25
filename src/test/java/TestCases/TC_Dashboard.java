package TestCases;

import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.LoginPageObject;

public class TC_Dashboard extends BaseClass {
	
	@Test
	public void AddEmployees()
	{
		LoginPageObject ls = new LoginPageObject(driver);
		ls.setUSername(username);
		ls.setPassword(password);
		ls.setClick();
		
		Dashboard ds = new Dashboard(driver);
		ds.findNameAndClick("Arun Kumar");
		
		
	}

}
