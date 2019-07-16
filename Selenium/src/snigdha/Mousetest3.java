package snigdha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousetest3 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement wb= driver.findElement(By.xpath("//span[text()='Category']"));
		Actions act= new Actions(driver);
		act.moveToElement(wb);
		act.perform();
		//Thread.sleep(1000);
		WebElement wb1=driver.findElement(By.xpath("//span[text()='Amazon Prime Video']"));
		//Actions act1= new Actions(driver);
		act.moveToElement(wb1);
		act.perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='All Videos']")).click();


		}
		



	}


