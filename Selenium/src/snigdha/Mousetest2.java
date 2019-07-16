package snigdha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

//naviagte to amazon.in ,then move mouse cursor to category,then amazon prime video,all video

public class Mousetest2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		//identify department dropdown menu element
		
		WebElement wb = driver.findElement(By.xpath("//span[text()='Category']"));
		//create an object to actions class
		Actions act = new  Actions(driver);
		//move mouse cursor to expected element
		act.moveToElement(wb);
		//Execute action class method
		
		act.perform();
		//click on submenu
		
	
		WebElement wb1=driver.findElement(By.xpath("//span[text()='Amazon Prime Video']"));
		act.moveToElement(wb1);
		act.perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='All Videos']")).click();


	}

}
