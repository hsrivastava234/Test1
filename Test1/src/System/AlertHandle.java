package System;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertHandle {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\hsrivastava\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@name='uid']")).sendKeys("mngr83361");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("rYvEqes");
		
		driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
		
		driver.findElement(By.xpath("//*[@href='DeleteCustomerInput.php']")).click();
		driver.findElement(By.xpath("//*[@name='cusid']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//*[@name='AccSubmit']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String AlertMessage = driver.switchTo().alert().getText();
		
		System.out.println("Display alter Message:"+AlertMessage );
		
		alert.accept();
	  
	  
	  
  }
}
