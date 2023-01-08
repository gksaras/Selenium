package org.greens.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Day 2 - Selectors
public class Selectors {
	public static void main(String[] args) {
		System.out.println("By Selectors");
		
		System.setProperty("webdriver.chrome.driver", 
	    "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// to find the element by using id
		WebElement txtUser = driver.findElement(By.id("email"));
		// to fill text box
		txtUser.sendKeys("abcdefghijk@gmail.com"); 
		WebElement txtPwd = driver.findElement(By.name("pass"));
		txtPwd.sendKeys("apocalypse");
		
	}
}

