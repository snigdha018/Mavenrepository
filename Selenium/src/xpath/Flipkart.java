package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	    try 
	    {
	    	driver.findElement(By.xpath("//button[text()='✕']")).click();
	    	
			
		} 
	    catch (Exception e)
	    {
			System.out.println("");
		}
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		//List<WebElement> lst =driver.findElements(By.className("niH0FQ"));
		//System.out.println(lst);
		List<WebElement> lst =driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		for(WebElement w: lst)
		{
			String products_name = w.getText();
			System.out.println(products_name);
			
		}
         
	    List<WebElement> lst1= driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
	    for(WebElement w1:lst1)
	    {
	    	String product_price=w1.getText();
	    	System.out.println(product_price);
	   }
	    
	}

}
