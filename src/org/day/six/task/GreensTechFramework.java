package org.day.six.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTechFramework {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		//to maximize the window
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		Robot r = new Robot();
	//Question 4
	WebElement framework = driver.findElement(By.xpath("(//h2[@class='mb-0'])[7]"));
	act.moveToElement(framework).click(framework).perform();
	act.contextClick(framework).perform();
	for (int i = 0; i < 10; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER); 
	}
}
