package System;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleNotification {
	
	public static void main(String[]args){
		
		Map<String, Object> pref=new HashMap<String,Object>();
		
		pref.put("profile.default_content_setting_values.notifications", 2);
		
		ChromeOptions Options = new ChromeOptions();
		
		Options.setExperimentalOption("pref",pref);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hsrivastava\\Downloads\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  
	}

}
