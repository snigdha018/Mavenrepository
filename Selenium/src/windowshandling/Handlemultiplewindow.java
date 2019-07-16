package windowshandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlemultiplewindow 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    driver.findElement(By.name("q")).sendKeys("iphone x",Keys.ENTER);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='Apple iPhone X (Silver, 64 GB)']")).click();
	    driver.findElement(By.xpath("//div[text()='Apple iPhone X (Silver, 256 GB)']")).click();
	    driver.findElement(By.xpath("//div[text()='Apple iPhone X (Space Gray, 64 GB)']")).click();
	    //get all window ids
	    String expectedTitle ="Iphone X - Buy Products Online at Best Price in India - All Categories | Flipkart.com";
	    Set<String> set= driver.getWindowHandles();
	    Iterator<String> it = set.iterator();
	   //switch expected window based on page title
	    for(int i=0;i<set.size();i++)
	    {
	    	String WindowID = it.next();
	    	driver.switchTo().window(WindowID);
	    	if(driver.getTitle().equals(expectedTitle))
	    	{
	    		break;
	    	}
	    }



	}

}
