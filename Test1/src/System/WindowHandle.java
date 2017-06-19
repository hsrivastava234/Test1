package System;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class WindowHandle {
	
WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\hsrivastava\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
	
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@href = '../articles_popup.php']")).click();
	
	
		String MainWindow =driver.getWindowHandle();
		
		  // To handle all new opened window.
		
		Set<String> s1 =driver.getWindowHandles();
		Iterator<String> il = s1.iterator();
		
		while(il.hasNext()) {
			String Childwindow= il.next();
		if(MainWindow.equalsIgnoreCase(Childwindow));
		
		Thread.sleep(50000);
		
		driver.switchTo().window(Childwindow);
		
		
		driver.findElement(By.xpath("//*[@name ='emailid']")).sendKeys("himanshu.famous@gmail.com");
		driver.findElement(By.xpath("//*[@name= 'btnLogin']")).click();
		
		driver.close();
		
		}
			driver.switchTo().window(MainWindow);
			
		}
	
		
	  
}

