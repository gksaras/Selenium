package org.greens.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFive {
	public static void main(String[] args) {
		
	System.out.println("HDFC Internet Banking");
	
	System.setProperty("webdriver.chrome.driver", 
    "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://netbanking.hdfcbank.com/");
	
	driver.switchTo().frame("login_page");
	
	WebElement userId = driver.findElement(By.name("fldLoginUserId"));
	userId.sendKeys("hdfc2012");
	
	WebElement element = driver.findElement(By.partialLinkText("Forgot Customer ID"));
	//txtCustomerId.sendKeys("hdfc123");
	if(element != null) {
		System.out.println("Element found by LinkText");
	}
    }
}