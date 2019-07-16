package snigdha;

import java.util.NoSuchElementException;

import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		try
		{
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Exception handled");
		}
           driver.findElement(By.name("q")).sendKeys("mobiles");
           driver.findElement(By.xpath("//button[@type='submit']")).click();
           String inventorycount = driver.findElement(By.xpath("//span[contains[text(),'Showing']]")).getText();
           
           System.out.println("inventory count is:" + inventorycount );
           String modifiedIc= inventorycount.substring(17,21);
           System.out.println("modified ic by substring is : +modified ic");
           String[] splitedIC = inventorycount.split(" ");
           int count =0;
           for(String str:splitedIC)
           {
        	   count++;
        	   if (count==6)
        	   {
        		   System.out.println("exact inventorycount:" + str);
        	   }
           }
	}

}
