package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.org.apache.xpath.internal.operations.Div;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com");
		Thread.sleep(2000);
		
		WebElement web3 =driver.findElement(By.xpath("//span[text()='From']"));
		web3.click();
		WebElement web4 =driver.findElement(By.xpath("//p[text()='Kolkata, India']"));
		web4.click();
		
		
		
		WebElement web1 =driver.findElement(By.xpath("//input[@placeholder='To']"));
		web1.click();
		WebElement web2 = driver.findElement(By.className("calc60"));
		web2.click();
		
	
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value='Sunday, 23 Jun 2019']]")).click();
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		List<WebElement> lst = driver.findElements(By.xpath("//p[@class='fli-code']"));
		for(WebElement w:lst)
		{
			String flight_no=w.getText();
			System.out.println(flight_no);
		}
		
		
		 
		
		
		
		
		
		
		
		

	}

}
