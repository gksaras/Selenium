package org.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOne {
	public static void main(String[] args) {
		System.out.println("Amazon Search");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement txtSearch = driver.findElement(By.xpath("//input[@type='text']"));
		txtSearch.sendKeys("iphone");
		WebElement btnSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
		btnSubmit.click();
		
	}
}
