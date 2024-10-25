package TestCases;

import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.LoginPageObject;
import junit.framework.Assert;

public class TC_Login extends BaseClass {
	
	@Test
	public void loginAdmin()
	{
		LoginPageObject pg = new LoginPageObject(driver);
		pg.setUSername(username);
		pg.setPassword(password);
		pg.setClick();
		
		
		Dashboard ds = new Dashboard(driver);
		boolean target = ds.dashboard();
		
		Assert.assertTrue(target);
		

		
	}

}



