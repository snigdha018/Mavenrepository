package snigdha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException  
	{
		FirefoxDriver driver=new FirefoxDriver();
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
		WebElement web5=driver.findElement(By.id("gb_71"));
		web5.click();
		driver.close();
		
		
		
		

	}

}