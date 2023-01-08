package org.greens.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTen {
	public static void main(String[] args) {
		
	System.out.println("Adactin Hotel");
	
	System.setProperty("webdriver.chrome.driver", 
    "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	WebElement txtUser = driver.findElement(By.id("username"));
	txtUser.sendKeys("kang");
	WebElement txtPwd = driver.findElement(By.name("password"));
	txtPwd.sendKeys("timeline");
	}
}
