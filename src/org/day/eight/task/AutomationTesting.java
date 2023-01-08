package org.day.eight.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
public static void main(String[] args) {
	System.out.println("Alerts");
	System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	/*WebElement simpleAlert= driver.findElement(By.xpath("//a[text()='Alert with OK '] "));
	simpleAlert.click();
	WebElement btnAlert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	btnAlert.click();
	
	WebElement confirmAlert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	confirmAlert.click();
	WebElement clkAlert = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	clkAlert.click();*/
	
	WebElement promptAlert = driver.findElement(By.xpath("//a[text()='Alert with Textbox '] "));
	promptAlert.click();
	WebElement sendAlert = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	sendAlert.click();
	//driver - switch to alert
	Alert alert = driver.switchTo().alert();
	//alert.accept();
	String text = alert.getText();
	System.out.println(text);
	alert.sendKeys("dream walk");
	//alert.dismiss();
	alert.accept();
	}
}
