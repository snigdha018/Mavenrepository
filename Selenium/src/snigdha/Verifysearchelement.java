package snigdha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Verifysearchelement
{

	public static void main(String[] args)
	{
		String expectedmsg = "Couldn't find your Google Account" ;
		String exptcolor="rgb(217, 48, 37)";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("abc");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//find the element of the msg
		WebElement web=driver.findElement(By.xpath("//div[@class='GQ8Pzc']"));
		String actualmsg = web.getText();
		//String actualcolor= web.getCssValue("color");
		String actualcolor=web.getCssValue("color");
		
		if (expectedmsg.contains(actualmsg))
		{
			System.out.println("msg verified is ==pass");
		}
		else 
		{
			System.out.println("msg  is not verified=fail");
		} 
		if (exptcolor.equals(actualcolor))
		{
		   System.out.println("color is verified pass");	
		}
		else {
			System.out.println("color is not verified pass");
		}
		//driver.quit();
		
		
	}


			

		
	}

			