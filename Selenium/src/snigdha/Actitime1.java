package snigdha;

import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
         driver.findElement(By.name("pwd")).sendKeys("manager");
         driver.findElement(By.id("loginButton")).click();
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
         wb3.sendKeys("HDFC");
         WebElement wb4=driver.findElement(By.id("customerLightBox_commitBtn"));
         wb4.click();
         //verify error message 
        String expmessage= "Customer with such name already exists";
        WebElement wb5=driver.findElement(By.id("customerLightBox_nameDuplicateError"));
        String actualmessage=wb5.getText();
        if(actualmessage.equals(expmessage))
        		{
        	System.out.println("error message displayed");
        		}
        else 
        {
           System.out.println("error message is not displayed");			
		}
        String exptcolor= "rgb(226, 73, 52)";
        String actualcolor=wb5.getCssValue("color");
        if (actualcolor.equals(exptcolor))
        {
        	System.out.println("Color is verified");
			
		}
        else
        {
			System.out.println("color is not verified");
		}
       
        Thread.sleep(2000);
        driver.findElement(By.id("logoutLink")).click();
        
        driver.close();
	}

}
