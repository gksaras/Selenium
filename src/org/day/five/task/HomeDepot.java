package org.day.five.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		//to maximize the window
		driver.manage().window().maximize();
		Actions acc = new Actions(driver);
		WebElement alldept = driver.findElement(By.xpath("//a[text()='All Departments']"));
		acc.moveToElement(alldept).perform();
		WebElement option = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		acc.moveToElement(option).perform();
		WebElement choice = driver.findElement(By.xpath("//a[text()='Air Conditioners']"));
		acc.clickAndHold(choice).perform();;
		WebElement choose = driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		acc.moveToElement(choose).click(choose).perform();
		
	}
}
