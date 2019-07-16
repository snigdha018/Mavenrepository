package snigdha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Integrationtesting_dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.id("loginButton")).click();
		   Thread.sleep(2000);
		  WebElement wb =driver.findElement(By.xpath("//div[text()='TASKS']"));
	         wb.click();
	         //Projects & Customers
	         WebElement wb1 =driver.findElement(By.xpath("//a[text()='Projects & Customers']"));
	         wb1.click();
	        
	         WebElement wb2 =driver.findElement(By.xpath("//span[text()='Create Project']"));
	         wb2.click();
	         Thread.sleep(3000);
	         driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("abc");
	          Thread.sleep(5000);
	          
	          
	          driver.findElement(By.id("ext-gen23")).click();
	          
	          driver.findElement(By.id("ext-gen114")).click();
	          
	          WebElement wb3 =driver.findElement(By.xpath("//span[text()='Create Project']"));
	          wb3.click();
	          
	}

}
