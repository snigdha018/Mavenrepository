package snigdha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verifyelement2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		WebElement web = driver.findElement(By.xpath("//img[@src='https://www.facebook.com/rsrc.php/v3/yi/r/OBaVg52wtTZ.png']"));
		boolean web1 =web.isDisplayed();
		if(web1==true)
		{
			System.out.println("image is displayed");
		}
		else 
		{
			System.out.println("image is not displayed");
		}
		boolean radio1=driver.findElement(By.id("u_0_5")).isSelected();
		boolean radio2=driver.findElement(By.id("u_0_6")).isSelected();
		boolean radio3=driver.findElement(By.id("u_0_7")).isSelected();
		if (radio1 || radio2 || radio3) 
		{
			System.out.println("radio button selected ==pass ");
		}
		else 
		{
	       System.out.println("fail");	
		}
		
			driver.quit();
		

	}

}
