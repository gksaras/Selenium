package org.greens.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSeven {
	public static void main(String[] args) {
		
	System.out.println("Snap Deal");
	
	System.setProperty("webdriver.chrome.driver", 
    "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/login");
	WebElement txtUser = driver.findElement(By.name("username"));
	txtUser.sendKeys("joseph67@gmail.com");
	}
}