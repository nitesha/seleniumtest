package coding;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class AmazonSearchDDT {

	public static void main(String[] args) throws BiffException, IOException{
		// TODO Auto-generated method stub
		
		String filepath="E:\\TestData10.xls";
		FileInputStream fis = new FileInputStream(filepath); 
		Workbook wb= Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		String sft = sh.getCell(0, 0).getContents();
		System.out.println(sft);
		
		int rowCount =sh.getRows();
		System.out.println("no of rows are :" + rowCount);
		
		int colCount=sh.getColumns();
		System.out.println("no of columns are :" + colCount);
		
		int row,col;
		for (row=0;row<rowCount; row++)
		{
			for (col=0;col<colCount;col++)
			{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("www.amazon.com");
		WebElement tbSearch = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement btnSearch = driver.findElement(By.id("nav-search-submit-text"));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(sh.getCell(col, row).getContents());
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tbSearch.clear();
		tbSearch.sendKeys(sh.getCell(col, row).getContents());
		btnSearch.click();
		System.out.println("iteratrion # --" + row);
		driver.close();

		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(sh.getCell(1, 0).getContents());
		//driver.findElement(By.id("nav-search-submit-text")).submit();
		//driver.close();
		
			}
			
		}
			}
		
		
	}


