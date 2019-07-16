package snigdha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;





public class DynamicDropdown {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sushanta/Desktop/html/Qspider.html");
		String expval= ".net";
		boolean flag=false;
		WebElement mwb =driver.findElement(By.xpath("//select"));
		Select sel =new Select(mwb);
		
		List<WebElement> lst =sel.getOptions();
	
		
		for(int i=0;i<lst.size();i++)
		{
			String actval=lst.get(i).getText();
			if(expval.equals(actval))
			{
				flag=true;
			 //select the option and break the loop
			 sel.selectByVisibleText(actval);
			break;
		}

	}
        
		if(flag==true)
        {
        	System.out.println( expval +" options is available==pass");
        }
        else 
        {
			System.out.println(expval + " options is not available==fail");
		}

}
}

