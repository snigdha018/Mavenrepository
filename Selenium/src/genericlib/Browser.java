package genericlib;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import snigdha.Firefox;

public class Browser 
{
	public static WebDriver driver;
	
  public static void launchBrowser() throws Throwable
  {
  Filelib flib = new Filelib();
  String BROWSER = flib.getpropertyfiledata1("Browser");
        if(BROWSER.equals("Firefox"))
		  {
	          driver = new FirefoxDriver();
		  }
        else if (BROWSER.equals("Chrome")) 
        {
			driver = new ChromeDriver();
		}
        else if (BROWSER.equals("InternetExplorer")) 
        {
			driver= new InternetExplorerDriver();
		}
  }
  public static void Browser()
  {
	  
         
         driver.close();
   
  
   
}
}
