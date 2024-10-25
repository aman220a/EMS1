package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicTable {
	
WebDriver ldriver;
	
	public DynamicTable(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

	@FindBy(xpath = "//ul[@class='pagination']//li//a")
	List<WebElement> pagination;
	
	@FindBy(xpath="//table[@id='productTable']//tr")
	List<WebElement> tablerows;
	
	public void findNameAndclick(String ename)
	{
		boolean nameFound=false;
		
		for(int pageIndex=1;pageIndex<=pagination.size();pageIndex++)
		{
			for(int i=1;i<tablerows.size();i++)
			{
				WebElement fullname =tablerows.get(i-1).findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td[2]"));
				String name = fullname.getText();
				
				if(name.equalsIgnoreCase(ename))
				{
					System.out.println("Name Found");
					
					WebElement button = tablerows.get(i-1).findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td[4]//input"));
					
					button.click();
					
					
					nameFound=true;
					
					break;
				}
				
				
			}
			
			if(nameFound==true)
			{
				break;
			}
			
			if(pageIndex<pagination.size())
			{
				WebElement page=pagination.get(pageIndex);
				page.click();
			}
		}
		
		if(nameFound==false)
		{
			System.out.println("Element not found");
		}
	}
	

}
