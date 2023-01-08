package org.day.five.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	   "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/amazonprime?ref_=nav_cs_primelink_nonmember");
		//to maximize the window
		driver.manage().window().maximize();
		Actions acc = new Actions(driver);
		
	/*	WebElement move = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		acc.moveToElement(move).perform();
		WebElement signup = driver.findElement(By.xpath("(//span[text()='Sign in'])[3]"));
		acc.moveToElement(signup).perform();
		signup.click();*/
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		acc.moveToElement(prime).click(prime).perform();
		
		driver.get("https://www.amazon.in/amazonprime?ref_=nav_cs_primelink_nonmember");
		WebElement loginPrime = driver.findElement(By.cssSelector("a[name='submit']"));
		acc.moveToElement(loginPrime).click(loginPrime).perform();

	}
}
