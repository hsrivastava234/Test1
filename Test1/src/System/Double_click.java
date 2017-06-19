package System;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class Double_click {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\hsrivastava\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		 
	  
  

WebElement ele=	 driver.findElement(By.xpath(".//*[@id='post-body-7297556448793668582']/div[1]/button"));
	
System.out.println("Ready for action");
	
Actions action = new Actions(driver);
	action.doubleClick(driver.findElement(By.xpath(".//*[@id='post-body-7297556448793668582']/div[1]/button"))).perform();
	//saction.moveToElement(ele).doubleClick(ele).build().perform();
	
	/*Thread.sleep(3000);
     String Alert = driver.switchTo().alert().getText();
	 driver.switchTo().alert().accept();
	 driver.close();
	 */
	 System.out.println("test pass seccesfully...");
	

	
  }
	
}
