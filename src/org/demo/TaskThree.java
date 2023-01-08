package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TaskThree {
	public static void main(String[] args) {
		System.out.println("Edge Browser Launch");
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
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


