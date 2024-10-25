package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigeration {
	
	Properties pro;
	
	String Path = "/home/yagvendra/Documents/Selenium2/Employee/Configuration/Config.properties";
	
	public ReadConfigeration()
	{
		pro = new Properties();
		
		try {
		
		FileInputStream file = new FileInputStream(Path);
		
		pro.load(file);
		
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e.getMessage());
		}
	}
	
	public String getUrl()
	{
		String Url = pro.getProperty("baseUrl");
		return Url;
	}
	
	public String getUserNane()
	{
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getPassWord()
	{
		String password = pro.getProperty("password");
		return password;
	}

	
	
	

}
