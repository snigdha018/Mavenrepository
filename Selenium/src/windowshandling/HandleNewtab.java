package windowshandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleNewtab
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    driver.findElement(By.name("q")).sendKeys("iphone x",Keys.ENTER);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='Apple iPhone X (Silver, 64 GB)']")).click();
	    //get all windows session id
	     Set<String> set=driver.getWindowHandles();
	     //using iterator capture session id for set of collection
	      Iterator<String> it= set.iterator();
	      String parentid= it.next();
	      String childid= it.next();
	      //pass a driver control to child window
	      driver.switchTo().window(childid);
	      Thread.sleep(4000);
	      driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
	      driver.close();
	      //pass driver control back to parent window
	      driver.switchTo().window(parentid);
	      //perform action on parent window
	      driver.findElement(By.name("q")).clear();
	      driver.findElement(By.name("q")).sendKeys("nokia");
           //close the window
	      driver.quit();
	

}
}
