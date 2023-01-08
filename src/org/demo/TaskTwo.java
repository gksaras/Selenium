package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwo {
	public static void main(String[] args) {
		System.out.println("Chrome Browser Launch");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.get("https://www.amazon.in/");
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.get("https://www.facebook.com/");
		String currentUrl3 = driver.getCurrentUrl();
		System.out.println(currentUrl3);
		String title3 = driver.getTitle();
		System.out.println(title3);
		driver.get("http://www.greenstechnologys.com/");
		String currentUrl4 = driver.getCurrentUrl();
		System.out.println(currentUrl4);
		String title4 = driver.getTitle();
		System.out.println(title4);
	}

}

