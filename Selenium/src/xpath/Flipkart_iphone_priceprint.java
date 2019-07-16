package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.Select;

import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators.FollowingIterator;
import com.sun.org.apache.xpath.internal.operations.Div;

public class Flipkart_iphone_priceprint {

	public static void main(String[] args) throws InterruptedException 
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
		driver.findElement(By.name("q")).sendKeys("iphone 6s",Keys.ENTER);
		//capture price of the product
		String x ="//div[text()='Apple iPhone 6s (Rose Gold, 32 GB)']/../following-sibling::div[1]/div[1]/div/div[1]";
		String price=driver.findElement(By.xpath(x)).getText();
		Thread.sleep(3000);
		System.out.println(price);
		

	}

}
