package org.greens.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskThree {
	public static void main(String[] args) {
		
	System.out.println("Google");
	
	System.setProperty("webdriver.chrome.driver", 
    "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	
	WebElement txtSearch = driver.findElement(By.name("q"));
	txtSearch.sendKeys("Greens Technology");
	
	
    }
}
