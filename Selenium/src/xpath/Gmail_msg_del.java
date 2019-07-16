package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Gmail_msg_del 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		WebElement web=driver.findElement(By.id("identifierId"));
		web.sendKeys("snigdha.mishra018");
		
		WebElement web1=driver.findElement(By.xpath("//span[text()='Next']"));
		web1.click();
		Thread.sleep(2000);
		WebElement web2=driver.findElement(By.name("password"));
		web2.sendKeys("sushant@18");
		WebElement web3=driver.findElement(By.xpath("//span[text()='Next']"));
		web3.click();
		Thread.sleep(2000);
		
		WebElement web4=driver.findElement(By.xpath("//span[@class='gb_xa gbii']"));
		web4.click();
		 Thread.sleep(1000);
         String x = "//table[@class='F cf zt']/tbody/tr[2]/td[2]";
         WebElement wb = driver.findElement(By.xpath(x));
         wb.click();
         Thread.sleep(3000);
         
         
        driver.findElement(By.xpath("(//div[@class='asa']")).click();
       
         
         
	}

}
