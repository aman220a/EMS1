package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import PageObject.DynamicTable;

public class TC_Dynamic {
	
	@Test
	public void checkName()
	{
	

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);   // launch the browser0
				
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		DynamicTable dc = new DynamicTable(driver);
		
		dc.findNameAndclick("Wireless Mouse 20");
		
		
		
	}

}
