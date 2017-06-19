import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {
       
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hsrivastava\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		  driver.get("https://www.gmail.com");
		  driver.manage().window().maximize();
		 
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		WebElement ele =  driver.findElement(By.xpath(".//*[@id='identifierId']"));
		  ele.sendKeys("himanshu.famous@gmail.com");
		  
		ele= driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]"));
				ele.click();
				
				Thread.sleep(3000);
		 
		 WebElement ele1=  driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input"));
		  ele1.sendKeys("manu5466");
		  
		 ele1=driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span"));
				 
		 ele.submit();
		  
		  driver.findElement(By.xpath(".//*[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		  
		  driver.findElement(By.xpath(".//*[@id=':pg']")).click();
		  
		  
		  


	}

}
