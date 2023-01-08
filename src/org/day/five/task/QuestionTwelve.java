package org.day.five.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QuestionTwelve {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		//to maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Actions acc = new Actions(driver);
		WebElement alldept = driver.findElement(By.xpath("//a[text()='All Departments']"));
		acc.moveToElement(alldept).perform();
		Thread.sleep(3000);
		WebElement option = driver.findElement(By.xpath("//a[text()='Paint']"));
		acc.moveToElement(option).perform();
		Thread.sleep(3000);
		WebElement choice = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		acc.moveToElement(choice).perform();
		Thread.sleep(3000);
		WebElement choose = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		acc.moveToElement(choose).click(choose).perform();
	}
}
