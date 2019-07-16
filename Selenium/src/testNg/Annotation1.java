package testNg;



import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



import genericlib.Browser;
import genericlib.Filelib;

public class Annotation1 extends Browser
{
	@BeforeClass
	public void configBc() throws Throwable
	{
		System.out.println("launch a browser");
		launchBrowser();
	}
   @BeforeMethod
    public void configBM() throws Throwable
    {
	   Filelib flib = new Filelib();
	   String URL = flib.getpropertyfiledata1("URL");
	   String USERNAME= flib.getpropertyfiledata1("username");
	   String PASSWORD= flib.getpropertyfiledata1("password");
		   System.out.println("login");
		   driver.get("URL");
		   driver.findElement(By.id("username")).sendKeys(USERNAME);
		   driver.findElement(By.name("pwd")).sendKeys(USERNAME);
		   driver.findElement(By.id("login Button")).click();
		   Thread.sleep(3000);
    }
   @AfterMethod
   public void ConfigAM()
   {
	   System.out.println("logout");
	   driver.findElement(By.linkText("logout"));
	   
		   
    }
    @org.testng.annotations.AfterClass
   public void configAC()
   {
    	System.out.println("close browser");
    	driver.close();
   }
}
