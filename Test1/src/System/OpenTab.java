package System;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OpenTab {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException, AWTException {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\hsrivastava\\Downloads\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://www.seleniumhq.org");
	
	  WebElement ele =  driver.findElement(By.xpath(".//*[@href='/download/']"));
	   
	  Actions act= new Actions (driver);
	  act.moveToElement(ele).perform();
	  act.contextClick(ele).sendKeys(Keys.ARROW_DOWN).build().perform();
	  
	  Thread.sleep(6000);
	  
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_DOWN);
	  robot.keyRelease(KeyEvent.VK_DOWN);
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);
      
      
      Thread.sleep(5000);
      robot.keyPress(KeyEvent.VK_1);
      robot.keyPress(KeyEvent.VK_CONTROL);	
      robot.keyRelease(KeyEvent.VK_1);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      //driver.close();
      
	   
	   
	  

	   
	   
  }
}
