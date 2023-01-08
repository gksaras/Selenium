package org.day.five.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QuestionThirteen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();
		
		Actions acc = new Actions(driver);
		
		WebElement mobilesAndTablts = driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		acc.moveToElement(mobilesAndTablts).perform();
		
		WebElement newlyLaunches = driver.findElement(By.xpath("//span[text()='Mobile Cases & Covers']"));
		newlyLaunches.click();
		
	}
}
