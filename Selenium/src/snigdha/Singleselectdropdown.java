package snigdha;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Singleselectdropdown 
{

	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver=new FirefoxDriver();
       driver.get("http://facebook.com");
       WebElement w = driver.findElement(By.id("month"));
        Select sel1 = new Select(w);
        Thread.sleep(2000);
         sel1.selectByIndex(6);
         WebElement w2=driver.findElement(By.id("year"));
         Select sel2=new Select(w2);
         Thread.sleep(2000);
         sel2.selectByIndex(1);
	}

}
