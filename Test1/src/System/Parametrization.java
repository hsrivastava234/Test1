package System;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parametrization {
	
	
	WebDriver driver ;
	
	XSSFRow rw;
	XSSFCell cell;
  @Test

  public void f() throws IOException, InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\hsrivastava\\Downloads\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("http://www.gmail.com");
	  
	  
	  String Filepath = "D:/hsrivastava/workspace/Config/Input/test.xlsx";
	  FileInputStream fi = new FileInputStream(Filepath);
	  XSSFWorkbook wb = new XSSFWorkbook(fi);
	  XSSFSheet sh= wb.getSheet("text");
	  int rownum=sh.getLastRowNum();
	  //jxl.Sheet sh = wb.getSheet(0);
	  String Username ;
	  
	 // String TestData [][] = new String[sh.getRows()][sh.getColumns()];
	  
	  for (int i= 1;i<=rownum;i++){
		  
		  System.out.println(" loop is running");
		
	  int colnum= rw.getLastCellNum();
		  
	   for (int j=0;j<colnum;j++)
	  {
		  
		   
		 
		   
		Thread.sleep(2000);
		
	  
	   driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys();
	  
		  
	   }
	 
  
}
}

}