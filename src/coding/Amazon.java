package coding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Hello");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(10000);
		driver.get("www.youtube.com");
	}

}