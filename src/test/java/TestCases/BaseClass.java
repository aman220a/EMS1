package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import Utilities.ReadConfigeration;



public class BaseClass {
	
	static WebDriver driver;
	
	 ReadConfigeration rd = new ReadConfigeration();
	 String Url = rd.getUrl();
	 String username  = rd.getUserNane();
	 String password =rd.getPassWord();
	
	
	 @BeforeClass
		public void setUp()
		{
			
		       	ChromeOptions options = new ChromeOptions();
				
				options.addArguments("--remote-allow-origins=*");
				
				driver = new ChromeDriver(options);
				
				driver.manage().window().maximize(); 
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get(Url);
				
				
		}
		
		@AfterClass
		public void tearDown() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.quit();
		}

}
