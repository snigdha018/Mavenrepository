package snigdha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon 
{

	public static void main(String[] args)
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        WebElement wb1=driver.findElement(By.name("email"));
        wb1.sendKeys("coolsid061@gmail.com");
        WebElement wb2=driver.findElement(By.id("continue"));
        wb2.click();
        WebElement wb3=driver.findElement(By.name("password"));
        wb3.sendKeys("Sony@123");
        WebElement wb4=driver.findElement(By.id("signInSubmit"));
        wb4.click();
        
        
}
}
