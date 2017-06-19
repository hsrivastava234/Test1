package System;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Flipkart {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\hsrivastava\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
	  
  driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[3]/a/span")).click();
	  Thread.sleep(2000);
  driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[3]/ul/li/ul/li[2]/ul/li[3]/a")).click();
	 //ele.click();
  }
}
