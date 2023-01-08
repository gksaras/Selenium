package org.day.four.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		System.out.println("Google");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		
		WebElement txtSearch = driver.findElement(By.name("q"));
		txtSearch.sendKeys("greens velmurugan");
		WebElement clkSearch = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		clkSearch.click();
		WebElement clkLinkOne = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		clkLinkOne.click();
		
	}
}
