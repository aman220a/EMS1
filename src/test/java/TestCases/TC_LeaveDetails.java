package TestCases;

import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.LeaveDetails;
import PageObject.LoginPageObject;

public class TC_LeaveDetails extends BaseClass {
	
	@Test
	public void setLeaveDetails() throws InterruptedException
	{

		LoginPageObject ls = new LoginPageObject(driver);
		ls.setUSername(username);
		ls.setPassword(password);
		ls.setClick();
		
		Dashboard ds = new Dashboard(driver);
		ds.findNameAndClick("Arun Kumar");
		
		LeaveDetails ld= new LeaveDetails(driver);
		ld.setAction();
		Thread.sleep(3000);
		ld.setStatus("Approve");
		Thread.sleep(3000);
		ld.setDescription("Approve Leave");
		ld.setApply();
		
		
		
	}

}
