package TestCases;

import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.LoginPageObject;
import junit.framework.Assert;

public class TC1_Login extends BaseClass {
	
	
	@Test(dataProvider="Logindata",dataProviderClass =Utilities.DataProviders.class)
	public void loginDataDriven(String emp,String pwd , String val)
	
	{
		LoginPageObject pg = new LoginPageObject(driver);
		pg.setUSername(emp);
		pg.setPassword(pwd);
		pg.setClick();
		
		
	Dashboard ds = new Dashboard(driver);
	boolean target = ds.dashboard();
	
	if(val.equalsIgnoreCase("valid"))
	{
		if(target==true)
		{
		
		ds.clickAdmin();
		ds.clickLog();
		ds.clickBack();
		Assert.assertTrue(true);
		
		}
		
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	if(val.equalsIgnoreCase("invalid"))
	{
		if(target==true)
		{
		
		ds.clickAdmin();
		ds.clickLog();
		ds.clickBack();
		Assert.assertTrue(false);
		
		}
		
		else
			
		{
	      Assert.assertTrue(true);
			
		}
	}
	
	

	}
	
	
}
