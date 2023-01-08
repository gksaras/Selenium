package org.day.five.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		//to maximize the window
		driver.manage().window().maximize();
		WebElement dragBank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dropBank = driver.findElement(By.id("bank"));
		WebElement dragValue = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement dropValue = driver.findElement(By.id("amt7"));
		//Mouse Actions
		Actions acc = new Actions(driver);
		acc.dragAndDrop(dragBank, dropBank).perform();
		acc.dragAndDrop(dragValue, dropValue).perform();
		
		WebElement dragSales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement dropSales = driver.findElement(By.id("loan"));
		WebElement dragAmount = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dropAmount = driver.findElement(By.id("amt8"));
		
		acc.dragAndDrop(dragSales, dropSales).perform();
		acc.dragAndDrop(dragAmount, dropAmount).perform();
	}
}
