package pom_TC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import pageObject.BMIcalculator;;

public class test_cases {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    String baseurl ="http://www.mayoclinic.org/diseases-conditions/obesity/in-depth/bmi-calculator/itt-20084938";
	    driver.get(baseurl);
	    driver.manage().window().maximize();
	    
	    String exlpath = "E:\\TestData11.xls";
	    FileInputStream fis = new FileInputStream(exlpath);
	    Workbook wb =  Workbook.getWorkbook(fis);
	    Sheet sh = wb.getSheet("Sheet1");
	    String celdat = sh.getCell(0, 0).getContents();
	    System.out.println(celdat);
	    System.out.println(sh.getCell(0, 1).getContents());
	    
	    BMIcalculator.textboxweight(driver).sendKeys(sh.getCell(0, 1).getContents());
	    
	    BMIcalculator.textboxheightft(driver).sendKeys(sh.getCell(0, 2).getContents());
	    
	    BMIcalculator.textboxheightin(driver).sendKeys(sh.getCell(0, 3).getContents());
	    
	    BMIcalculator.radiobtnsexm(driver).click();
	    
	    BMIcalculator.dropdownYear(driver).sendKeys(sh.getCell(0, 6).getContents());
	    BMIcalculator.dropdownMonth(driver).sendKeys(sh.getCell(0, 4).getContents());
	    BMIcalculator.dropdownday(driver).sendKeys(sh.getCell(0, 5).getContents());
	    
	    BMIcalculator.BtnCalculate(driver).click();
	    
	    
	   /* BMIcalculator.textboxweight(driver).sendKeys("130");
	    BMIcalculator.textboxheightft(driver).sendKeys("5");
	    BMIcalculator.radiobtnsexm(driver).click();
	    BMIcalculator.textboxheightin(driver).sendKeys("9");
	    BMIcalculator.dropdownYear(driver).sendKeys("1990");
	    
	    BMIcalculator.dropdownMonth(driver).sendKeys("sep");
	    BMIcalculator.dropdownday(driver).sendKeys("11");
	    
	    BMIcalculator.BtnCalculate(driver).click();*/
	}

}
