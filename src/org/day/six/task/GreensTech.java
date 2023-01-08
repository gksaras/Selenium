package org.day.six.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		//to maximize the window
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		Robot r = new Robot();
		//Question 3
		WebElement clkInterview = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		act.moveToElement(clkInterview).click(clkInterview).perform();
		WebElement cts = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		act.moveToElement(cts).contextClick(cts).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER); 		
	}
}
