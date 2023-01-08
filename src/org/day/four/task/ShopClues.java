package org.day.four.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopClues {
	public static void main(String[] args) {
		System.out.println("Shop Clues");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html ");
		
		WebElement txtSearch = driver.findElement(By.id("autocomplete"));
		txtSearch.sendKeys("T-Shirts");
		WebElement clkSearch = driver.findElement(By.xpath("//a[text()='Search']"));
		clkSearch.click();
		WebElement first = driver.findElement(By.xpath("(//img[@onclick='homePageTracking(this);'])[1]"));
		first.click();
	}
}
