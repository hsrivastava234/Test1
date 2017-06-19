
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.collect.Table.Cell;

public class BrokenlistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hsrivastava\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> total_links = driver.findElements(By.tagName("a"));

		System.out.println("Total no of link found on page " + total_links);

		boolean isvalid = false;
		for (int i = 0; i < total_links.size(); i++) {

			String URL = total_links.get(i).getAttribute("href");

			if (URL != null) {

				isvalid = getResponseCode(URL);

				if (isvalid) {

					System.out.println("Valid Link:" + URL);

				} else {
					System.out.println("Broken Link ------> " + URL);
				}
			} else {
				System.out.println("Broken Link..." + URL);
			}

		}

	}

	private static boolean getResponseCode(String uRL) {
		// TODO Auto-generated method stub
	
		boolean validResponse = false;

		try {

			HttpResponse urlresp = new DefaultHttpClient().execute(new HttpGet(uRL));
			int resp_code = urlresp.getStatusLine().getStatusCode();

			System.out.println("Responce code = " + resp_code);

			if (resp_code == 404) {
				validResponse = false;
			} else {
				 validResponse = true;
			}
		} catch (Exception e) {

			 validResponse = true;
		}
		return validResponse;

	}
	



	  


}



