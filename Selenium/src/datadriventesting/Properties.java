package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import sun.security.action.GetBooleanAction;

public class Properties 
{

	public static void main(String[] args) throws Throwable
	{
		FileInputStream fobj = new FileInputStream("./data/commomdata.properties");
		//load the data 
		java.util.Properties p1 = new java.util.Properties();
		p1.load(fobj);
		//get the data using unique key
		String url= p1.getProperty("URL");
		String username= p1.getProperty("USERNAME");
		String password=p1.getProperty("PASSWORD");
		System.out.println(url);
		System.out.println(username);
		System.out.println(password );
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		

	}

	
		
	}


