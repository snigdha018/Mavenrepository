package windowshandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IRCTC_POPUP 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.irctc.com/Emp_Login.jsp");
	    Thread.sleep(3000);
		driver.findElement(By.name("Login")).click();
		//pass driver control to alert window
		 Thread.sleep(3000);
		 Alert alt = driver.switchTo().alert();
		 //verify error message is poped up 
		 if (alt.getText().equals("Username is required."))
		 {
			 System.out.println("error message is verified ===> passs");
		 }
		 else{
			 System.out.println("error message not verified ==>fail");
		 }
		 alt.accept();

	}

}
