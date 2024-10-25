package TestCases;

import org.testng.annotations.Test;

import PageObject.AddEmployeeSection;
import PageObject.Dashboard;
import PageObject.LoginPageObject;

public class TC_Employee extends BaseClass {
	
	@Test
	public void AddEmployee()
	{
		LoginPageObject pg = new LoginPageObject(driver);
		pg.setUSername(username);
		pg.setPassword(password);
		pg.setClick();
		
		Dashboard ds = new Dashboard(driver);
		ds.clickEmployeeSection();
		ds.clickAddEmployee();
		
		AddEmployeeSection ad= new AddEmployeeSection(driver);
		ad.setEmployeeId("ART1012");
		ad.setFirstName("Prince");
		ad.setLastName("Sharma");
		ad.setEmailAddress("amankumaralld02@gmail.com");
		ad.setDepartment("Marketing");
		ad.setGender("Male");
		ad.setDateofBirth("10", "12", "1995");
		ad.setContact("9140646057");
		ad.setCountry("India");
		ad.setAddress("Delhi");
		ad.setCity("Dwarka");
		ad.setPassword("Yadv@31234");
		ad.confirmPassword("Yadv@31234");
		ad.clickButton();
	}

}
