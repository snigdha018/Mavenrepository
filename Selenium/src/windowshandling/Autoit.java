package windowshandling;



	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	public class Autoit 
	{
	
	public static void main(String args[]) throws InterruptedException, AWTException
	{
	WebDriver driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	driver.get("https://www.autoitscript.com/site/autoit/downloads/");
	Thread.sleep(4000);
	// driver.findElement(By.xpath("//a[@class='btn btn--medium btn--download mb-s js-trigger-modal-di track-btn-download']")).click();
	driver.findElement(By.xpath("//img[@title='Download AutoIt']")).click();
	Thread.sleep(5000);
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	}                                          
	}