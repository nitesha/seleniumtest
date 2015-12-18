package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BMIcalculator {

	//WebDriver driver;
	
	public static  WebElement textboxweight(WebDriver driver)
	
	{
		
		return driver.findElement(By.id("weight"));
	}
	
	public static  WebElement textboxheightft(WebDriver driver)
	
	{
		
		return driver.findElement(By.id("feet"));
	}
	
	public static  WebElement textboxheightin(WebDriver driver)
	{
		
		return driver.findElement(By.id("inches"));
	}
	
	public static  WebElement radiobtnsexm(WebDriver driver)
	{
		
		return driver.findElement(By.id("male"));
	}
	
	public static WebElement radiobtnsexf(WebDriver driver)
	{
		
		return driver.findElement(By.id("female"));
	}
	
	public static WebElement dropdownMonth(WebDriver driver)
	
	{
		
		return driver.findElement(By.id("month"));
	}
	
	public static  WebElement dropdownday(WebDriver driver)
	
	{
		
		return driver.findElement(By.id("day"));
	}
	
	public static WebElement dropdownYear(WebDriver driver)
	
	{
		
		return driver.findElement(By.id("year"));
	}
	
	public static  WebElement BtnCalculate(WebDriver driver)
	
	{
		
		return driver.findElement(By.xpath(".//*[@id='bmiCalc']/button[2]"));
	}
	
}
