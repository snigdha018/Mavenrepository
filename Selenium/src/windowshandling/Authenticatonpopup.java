package windowshandling;

import java.sql.Driver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Authenticatonpopup {

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.get("http://admin:admin@the-internet.herokuapp.com");

	}

}
