import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openbrowser {

	public static void main(String[] args) {
		
		 
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\hsrivastava\\Downloads\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
     driver.get("https://www.google.com");
     driver.findElement(By.id("lst-ib")).sendKeys("firefox");
    // driver.close();
	}
	


}