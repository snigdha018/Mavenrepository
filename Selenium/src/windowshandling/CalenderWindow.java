package windowshandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

public class CalenderWindow {

	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://www.cleartrip.com/");
	  driver.findElement(By.xpath("//i[@class='icon ir datePicker']")).click();
	  Thread.sleep(60000);
	  int count=0;
	  while(count<=24)
	  {
		  try 
		  {
			String x = "//td[@data-month='2' and data-year='2020']/a[text()= '30']";
			driver.findElement(By.xpath(x));
		  } 
		  catch (Exception e) 
		  {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			count++;
		}
	  }

	}

}
