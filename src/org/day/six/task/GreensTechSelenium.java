package org.day.six.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTechSelenium {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		//to maximize the window
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		Robot rb = new Robot();
	//Question 7
	WebElement selenium = driver.findElement(By.xpath("(//h2[contains(text(),'Selenium')])[5]"));
	act.click(selenium).perform();
	WebElement clkDaySix = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/August-2019/Selenium Day6.txt']"));
	act.contextClick(clkDaySix).perform();
	
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER); 
	}
}
