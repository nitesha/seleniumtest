
package www.google.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ucmo.edu/surveys/?formID=2770");
	   WebElement Searchbox= driver.findElement(By.id("_59796_gre45822845eg2770"));
	   Searchbox.sendKeys("Nitesh");
	   
		
		
			}
}
