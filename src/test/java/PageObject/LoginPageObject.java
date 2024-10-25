package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	WebDriver ldriver;
	
	public LoginPageObject(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement passWord;
	
	@FindBy(id="form_submit")
	WebElement button;
	
	public void setUSername(String ename)
	{
		userName.sendKeys(ename);
	}
	
	public void setPassword(String pwd)
	{
		passWord.sendKeys(pwd);
	}
	
	public void setClick()
	{
		button.click();
	}
	

}
