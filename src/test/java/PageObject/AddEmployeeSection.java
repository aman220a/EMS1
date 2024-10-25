package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddEmployeeSection {
	
WebDriver ldriver;
	
	public AddEmployeeSection(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(name="empcode")
	WebElement eid;
	
	@FindBy(name="firstName")
	WebElement fstname;
	
	@FindBy(name="lastName")
	WebElement lstname;
	
	@FindBy(name="email")
	WebElement eml;
	
	@FindBy(name="department")
	WebElement dept;
	
	@FindBy(name="gender")
	WebElement type;
	
	@FindBy(name="dob")
	WebElement date;
	
	@FindBy(name="mobileno")
	WebElement no;
	

	@FindBy(name="country")
	WebElement cnt;
	
	@FindBy(name="address")
	WebElement addr;
	
	@FindBy(name="city")
	WebElement cty;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(name="confirmpassword")
	WebElement cnfpwd;
	
	@FindBy(id="update")
	WebElement button;
	
	public void setEmployeeId(String id)
	{
		eid.clear();
		eid.sendKeys(id);
	}
	
	public void setFirstName(String uname)
	{
		fstname.sendKeys(uname);
	}
	
	public void setLastName(String lname)
	{
		lstname.sendKeys(lname);
	}
	
	public void setEmailAddress(String mail)
	{
		eml.sendKeys(mail);
	}
	
	public void setDepartment(String dep)
	{
		Select sc = new Select(dept);
		sc.selectByVisibleText(dep);
	}
	
	public void setGender(String gen)
	{
		Select sc1 = new Select(type);
		sc1.selectByVisibleText(gen);
			
	}
	
	public void setDateofBirth(String dd,String mm,String yyyy)
	{
		date.sendKeys(dd);
		date.sendKeys(mm);
		date.sendKeys(yyyy);
	}
	
	public void setContact(String number)
	{
		no.sendKeys(number);
	}
	
	public void setCountry(String country)
	{
		cnt.sendKeys(country);
	}
	
	public void setAddress(String address)
	{
		addr.sendKeys(address);
	}
	
	public void setCity(String city)
	{
		cty.sendKeys(city);
	}
	
	public void setPassword(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void confirmPassword(String passwrd)
	{
		cnfpwd.sendKeys(passwrd);
	}
	
	public void clickButton()
	{
		button.click();
	}
}
