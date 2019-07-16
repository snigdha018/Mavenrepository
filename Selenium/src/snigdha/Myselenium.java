package snigdha;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Myselenium 
{


	public static void main(String[] args) 
	{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://facebook.com");
	driver.get("http://google.com");
	driver.get("https://www.facebook.com/profile.php?id=100005600777406");
		

	}

}
