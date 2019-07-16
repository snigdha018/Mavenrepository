package windowshandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip 
{

	
		public static void main(String[] args) throws InterruptedException
		{
			
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@text='DEPARTURE']")).click();
		Thread.sleep(3000);
		int count=0;
		while(count<=24)
		{
		try
		{
		String x="//div[@aria-label='Sat Jun 29 2019']/div/p[text()='29']";
		driver.findElement(By.xpath(x)).click();
		Thread.sleep(3000);
		break;
		}
		catch(Throwable e)
		{

		driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
		System.out.println("try------");
		count++;
		}
		}
		}
		

			



	}


