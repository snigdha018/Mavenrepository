package snigdha;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keytest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(3000);
		WebElement wb =driver.findElement(By.id("username"));
		wb.sendKeys("admin");
		/*WebElement wb1 =driver.findElement(By.id("pwd"));
		wb1.sendKeys("manager");*/
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(wb).perform();
		Thread.sleep(3000);
		//copy
		act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		act.sendKeys(Keys.TAB).perform();
		
		//paste
		act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD)).perform();
		

	}

}
