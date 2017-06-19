package System;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parallelbrowsersuit {
	 WebDriver driver;



@Parameters("browser")
  public void TestBrowser(String browser) {
	  
	  if(browser.equalsIgnoreCase("Firefox")){
		  System.setProperty("Webdriver.gecko.driver","C:\\Users\\hsrivastava\\Downloads\\geckodriver.exe");
				  driver = new FirefoxDriver();
	  }
	  
	  else if(browser.equalsIgnoreCase("Chrome")){
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hsrivastava\\Downloads\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("Edge")){
			//set path to Edge.exe
			System.setProperty("webdriver.edge.driver",".\\MicrosoftWebDriver.exe");
			}
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
  @Test
  public void testParameterWithXML() throws InterruptedException{
		driver.get("http://demo.guru99.com/V4/");
	
		WebElement userName = driver.findElement(By.name("uid"));
		
		userName.sendKeys("guru99");
		
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("guru99");
	  
  }
  
  
  }
  
  


