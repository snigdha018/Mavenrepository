package testNg;

import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation
{
   @BeforeClass
   public void configBc()
   {
	   System.out.println("launch a browser");
	   
   }
   @BeforeMethod
   public void configBM()
   {
	   System.out.println("login");
   }
   
   @Test
   public void createcustomerTest()
   {
	   System.out.println("create customer name");
   }
   @Test
   public void modifycustomerTest()
   {
	   System.out.println("modify customer name");
   }
   @Test
   public void deletecustomerTest()
   {
	   System.out.println("delete customer");
   }
   @AfterMethod 
   public void configAm()
   {
	   System.out.println("logout");
   }
	@AfterClass
	public void configAC()
	{
		System.out.println("logout");
	}
	
}
