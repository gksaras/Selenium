package org.day.eight.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanaraBank {
	public static void main(String[] args) {
		System.out.println("Canara Bank");
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.manage().window().maximize();
		WebElement btnSubmit = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		btnSubmit.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
