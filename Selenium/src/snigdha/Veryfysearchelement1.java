package snigdha;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.graph.AbstractValueGraph;
import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLBoundFault;

import net.bytebuddy.matcher.DeclaringMethodMatcher;

public class Veryfysearchelement1 {

	public static void main(String[] args) throws InterruptedException 
	{

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		WebElement web=driver.findElement(By.id("identifierId"));
		web.sendKeys("snigdha.mishra018");
		
		WebElement web1=driver.findElement(By.xpath("//span[text()='Next']"));
		web1.click();
		Thread.sleep(2000);
		WebElement web2=driver.findElement(By.name("password"));
		web2.sendKeys("sushant@18");
		WebElement web3=driver.findElement(By.xpath("//span[text()='Next']"));
		web3.click();
		Thread.sleep(8000);
		//verify inbox page
		String exphomepage="Inbox";
		String actHomepage=driver.getTitle();
		System.out.println(actHomepage);
		if (actHomepage.contains(exphomepage)) 
		{
			System.out.println("home page is verified== pass");
		}
		else 
		{
			System.out.println("home page is not verified==fail");
			
		}
		//verify search backend value
		String expvalue ="Search mail";
		WebElement editwb= driver.findElement(By.name("q"));
		String actual=editwb.getAttribute("placeholder");
		if (expvalue.contains(actual))
		{
			System.out.println("editbox verified==pass");
		}
		else
		{
			System.out.println("editbox is not verified==fail");
		}
		//capture the dimension of editbox
		org.openqa.selenium.Dimension dem = editwb.getSize();
		System.out.println(dem.height);
		System.out.println(dem.width);
		//capture the location of edit box
		Point loc =editwb.getLocation();
		System.out.println(loc.x);
		System.out.println(loc.y);
		
		
		
		
			
		

	}

	

}
