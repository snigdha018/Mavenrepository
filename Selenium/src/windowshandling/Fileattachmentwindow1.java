package windowshandling;

import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileattachmentwindow1 
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
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Pop-out']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-tooltip='Attach files']/div/div")).click();
		StringSelection filepath = new StringSelection("C:\Users\sushanta\Desktop\document\gc reddy.txt");
		

	}

}
