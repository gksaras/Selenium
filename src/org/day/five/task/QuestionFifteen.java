package org.day.five.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QuestionFifteen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	   "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/amazonprime?ref_=nav_cs_primelink_nonmember");

		driver.manage().window().maximize();
		
		Actions acc = new Actions(driver);
		
		WebElement moveToSign = driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
		acc.moveToElement(moveToSign).perform();
		
		WebElement signup = driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		acc.moveToElement(signup).perform();
		signup.click();
		
		WebElement txtUser = driver.findElement(By.name("email"));
		txtUser.sendKeys("amazon26@gmail.com");
	}
}
