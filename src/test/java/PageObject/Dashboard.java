package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
WebDriver ldriver;
	
	public Dashboard(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"menu\"]/li[2]/a/span")
	WebElement emp;

	@FindBy(xpath ="/html/body/div/div[2]/div[3]/div/div/div/div/div/center/a")
	WebElement  Addemp;
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div[1]/div/h4")
	WebElement dash;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div[2]/div/h4")
	WebElement ADMIN;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div/a")
	WebElement Log;
	
	@FindBy(xpath="/html/body/div[1]/div/div/form/div[2]/div[5]/p/a")
	WebElement Adminlogin;
	
	
	@FindBy(xpath="//table[@class='table table-hover table-bordered table-striped progress-table text-center']//tbody//tr")
	List<WebElement> tablerows;
	
	public void clickEmployeeSection()
	{
		emp.click();
	}
	
	public void clickAddEmployee()
	{
		Addemp.click();
	}
	
	
	
	// Access through each row and find the full name from column;
	
	public void findNameAndClick(String nameFind)
	
	{
		
	for(int i=1;i<=tablerows.size();i++)
		
	{
		WebElement fullname = tablerows.get(i-1).findElement(By.xpath("//table[@class='table table-hover table-bordered table-striped progress-table text-center']//tbody//tr["+i+"]//td[3]//a"));
		String name=fullname.getText();
		
		if(name.equalsIgnoreCase(nameFind))
		{
			System.out.println("Name Found");
			WebElement button =tablerows.get(i-1).findElement(By.xpath("//table[@class='table table-hover table-bordered table-striped progress-table text-center']//tbody//tr["+i+"]//td[7]"));
			button.click();
			break;
		}
	}
	}
	
	
	public boolean dashboard()
	{
		try {
		
		return (dash.isDisplayed());
		
		}
		
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public void clickAdmin()
	{
		ADMIN.click();
	}
	
	public void clickLog()
	{
		Log.click();
	}
	
	public void clickBack()
	{
		Adminlogin.click();
	}
	
	
}
