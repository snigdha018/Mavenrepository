package snigdha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Actitime {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
         driver.findElement(By.name("pwd")).sendKeys("manager");
         driver.findElement(By.id("loginButton")).click();
         //acti-time timetrack page
         String exphomepage = "actiTIME";
         String acthomepage=driver.getTitle();
         if (acthomepage.contains(exphomepage))
         {
			System.out.println("actitime home page verified==pass");
		}
         else 
         {
			System.out.println("acttime home page not verified==fail");
		}
         Thread.sleep(2000);
         //navigate to task page
         WebElement wb =driver.findElement(By.xpath("//div[text()='TASKS']"));
         wb.click();
         String actualmsg=driver.getTitle();
         String expmsg= "Open Tasks";
         if (actualmsg.contains(expmsg))
         {
        	 System.out.println(" open tasks page verified == pass");
			
		}
         else 
         {
		     System.out.println("open tasks page not  verified == fail");	
		 }
         //navigate to project and customer page
         WebElement wb1=driver.findElement(By.xpath("//a[text()='Projects & Customers']"));
         wb1.click();
         WebElement wb2=driver.findElement(By.xpath("//span[text()='Create Customer']"));
         wb2.click();
         //create a customer in customer page
         WebElement wb3=driver.findElement(By.id("customerLightBox_nameField"));
         wb3.click();
         wb3.sendKeys("AA_BBCC2");
         WebElement wb4=driver.findElement(By.id("customerLightBox_commitBtn"));
         wb4.click();
         
         Thread.sleep(3000);

         //verify error msg
         WebElement wb5=driver.findElement(By.className("successmsg"));
         String exptmsg= "successfully created";
         String actmsg=wb5.getText();
         if (actmsg.contains(exptmsg)) 
         {
			System.out.println("verified output");
		}
         else 
         {
		    System.out.println("not verified");	
		}
         //here output is not coming
         Thread.sleep(2000);
        WebElement logout= driver.findElement(By.id("logoutLink"));
        logout.click();
       
         
         
            
		

	}

}
