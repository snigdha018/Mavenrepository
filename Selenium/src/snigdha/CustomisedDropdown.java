package snigdha;

import java.util.Random;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomisedDropdown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		//create random class object
		Random r =new Random();
	    int randomno =r.nextInt(100);
		//test data
		String username="admin";
		String password="manager";
		String customername="HDFC+randomno";
		String projectname="testing";
		//login page
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		//click on login
		driver.findElement(By.id("loginButton")).click();
		//Thread.sleep(2000);
		
		//for click on task
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("testing");
		
		driver.findElement(By.xpath("//button[text()='-- Please Select Customer to Add Project for  --']")).click();
		//Thread.sleep(3000);
		//String x ="//a[text()=' "+ customername +" ']";
		
		driver.findElement(By.xpath("//a[text()='HDFC']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		
		
		

	}

}
