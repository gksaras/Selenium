package org.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskEight {
	public static void main(String[] args) {
		System.out.println("Greens Tech");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
	
		WebElement findRes= driver.findElement(By.id("heading201"));
		findRes.click();
		WebElement findModel = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
		findModel.click();
	}
}

