package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Day One Selenium");
		
		//config the browser
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		
		//Creating WebDriver Interface to access ChromeDriver
		WebDriver driver = new ChromeDriver();
	
		
		//to load the url to the web page
		driver.get("https://www.facebook.com/");
		
		//to get current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//to get the title of the web page
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
	}
}
