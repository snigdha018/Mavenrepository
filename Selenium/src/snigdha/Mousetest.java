package snigdha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import jdk.jfr.internal.cmd.Execute;

public class Mousetest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://amazon.com");
		//identify department dropdown menu element
		WebElement wb = driver.findElement(By.xpath("//span[text()='Departments']"));
		//create an object to actions class
		Actions act = new Actions(driver);
		//move mouse cursor to expected element
		Thread.sleep(1000);
		act.moveToElement(wb);
		//Execute action class method
		act.perform();
		Thread.sleep(1000);
		//click on sub menu
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		

	}

}
