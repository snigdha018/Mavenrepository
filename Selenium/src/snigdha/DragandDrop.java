package snigdha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		//identify source and destination element
		WebElement swb =driver.findElement(By.id("draggable"));
		WebElement dwb =driver.findElement(By.id("droptarget"));
		Actions act =new Actions(driver);
		Thread.sleep(4000);
		act.dragAndDrop(swb,dwb).perform();
		

	}

}
