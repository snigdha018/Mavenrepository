package snigdha;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) 
	{
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http:\\facebook.com");
		String actTitle= driver.getTitle();
		System.out.println("actTitle");
		if (actTitle.equals("facebook"))
		{
			System.out.println("login page is displayed==pass");
		}
		else 
		{
		    System.out.println("login page is not displayed==fail");	
		}
		String actURL=driver.getCurrentUrl();
		System.out.println(actURL);
		//capture current page html source code
		String pageHtmlcode=driver.getPageSource();
		
		System.out.println(pageHtmlcode);
		driver.close();
		
		
		

	}

}
