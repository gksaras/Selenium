package org.greens.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFour {
	public static void main(String[] args) {
		
	System.out.println("ICICI Bank");
	
	System.setProperty("webdriver.chrome.driver", 
    "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	
	WebElement txtUser = driver.findElement(By.name("q"));
	txtUser.sendKeys("Greens Technology");
	}
}