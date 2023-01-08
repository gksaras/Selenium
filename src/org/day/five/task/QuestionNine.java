package org.day.five.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QuestionNine {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		//to maximize the window
		driver.manage().window().maximize();
		WebElement course = driver.findElement(By.xpath("//div[text()='Courses ']"));
		//Mouse over actions
		Actions acc = new Actions(driver);
		acc.moveToElement(course).perform();
		
		WebElement rpa = driver.findElement(By.xpath("//span[text()='RPA (6)']"));
		acc.moveToElement(rpa).perform();
		
		WebElement clktext = driver.findElement(By.xpath("//span[text()='Blue Prism Certification Training']"));
		clktext.click();
	}
}
