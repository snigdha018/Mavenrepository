package snigdha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;




public class Rightclick 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		WebElement wb = driver.findElement(By.linkText("Gmail"));
		Thread.sleep(4000);
		Actions act =new Actions(driver);
		//perform right click on gmail link
		act.contextClick(wb).sendKeys("W").perform();
		//open gmail page in new tab
		Thread.sleep(8000);
		
		
		
		
		
		
		
		
	}
	
}
		
		
	

