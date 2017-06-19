package System;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DateTimePicker {
	
	WebDriver driver;
	@Test

    public void dateTimePicker() throws InterruptedException{

		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\hsrivastava\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		  
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/selenium");

      

        WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

        

        dateBox.sendKeys("09/25/2013");

        //Press tab to shift focus to time field

        dateBox.sendKeys( Keys.SPACE );

        //Fill time as 02:45 PM

        dateBox.sendKeys(  "02:45PM"  );
        
        Date date = new Date(0);
        
        DateFormat date1= DateFormat.getDateTimeInstance();
        
        // Print the Date
        System.out.println("Current date and time is " +date1);
        
         driver.findElement(By.xpath("/descendant::input[@type='submit']")).click();
         
         Thread.sleep(3000);
         
         driver.close();
	}
    }
	
	

	


    
