package org.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSeven {
	public static void main(String[] args) {
		System.out.println("cleartrip Trains");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement txtFrom = driver.findElement(By.id("from_station"));
		txtFrom.sendKeys("Chennai");
		WebElement txtTo = driver.findElement(By.id("to_station"));
		txtTo.sendKeys("Bangalore");
		WebElement btnSearch= driver.findElement(By.id("trainFormButton"));
		btnSearch.click();
	}
}
