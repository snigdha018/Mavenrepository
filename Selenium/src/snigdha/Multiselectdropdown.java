package snigdha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdropdown 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sushanta/Desktop/html/dropdown.html");
		WebElement w = driver.findElement(By.xpath("//select"));
		Select sel1=new Select(w);
		boolean s= sel1.isMultiple();
		if(s)
		{
			System.out.println("verified");
			
			for(int i=0;i<10;i++)
			{
				sel1.selectByIndex(i);
			}
		}
		    else 
			{ 
				System.out.println("its not a multiselect dropdown");
			}
		      sel1.deselectAll();
		}
	}

