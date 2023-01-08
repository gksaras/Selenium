package org.day.ten.task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	public static void main(String[] args) {
		System.out.println("Windows Handling");
		System.setProperty("webdriver.chrome.driver",
	   "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");

		driver.manage().window().maximize();
		
		WebElement framework = driver.findElement(By.id("heading304"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", framework);
		js.executeScript("arguments[0].click()", framework);
		
		WebElement junit = driver.findElement(By.xpath("//a[text()=' JUNIT']"));
		js.executeScript("arguments[0].click()", junit);
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		
		Set<String> allWindowId = driver.getWindowHandles();
		for (String eachWindowId : allWindowId) {
			if(!parentWindowId.equals(eachWindowId)) {
				driver.switchTo().window(eachWindowId);
			}
			System.out.println(eachWindowId);
		}
		WebElement questions = driver.findElement(By.xpath("//pre[contains(text(),'1. What is JUnit?')]"));
		Object question = js.executeScript("return arguments[0].getAttribute('value')", questions);
		//converting object into string
		String quest=(String)question;//downcasting
		System.out.println(quest);
		
	}
}
