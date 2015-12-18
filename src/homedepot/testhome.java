package homedepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class testhome {
	@Test
	public static void main(String args[]) throws InterruptedException {

	WebDriver hddriver = new FirefoxDriver();
	hddriver.get("http://www.homedepot.com/");
	

}
}