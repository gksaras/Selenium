package org.day.ten.task;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreenTechnology {
	public static void main(String[] args) throws AWTException {
		System.out.println("Windows Handling");
		System.setProperty("webdriver.chrome.driver",
	   "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(courses).perform();
		
		WebElement python = driver.findElement(By.xpath("(//span[text()='Python'])[1]"));
		python.click();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> allWindow = driver.getWindowHandles();
		for (String eachWindow : allWindow) {
			driver.switchTo().window(eachWindow);
		}
		
		WebElement exploreCurriculum = driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", exploreCurriculum);
		acc.contextClick(exploreCurriculum).perform();
		
		Robot r = new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
}
