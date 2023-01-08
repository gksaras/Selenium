package org.day.eight.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineSBI {
	public static void main(String[] args) {
		System.out.println("Online SBI Banking");
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement btnContinue = driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
		btnContinue.click();
		WebElement btnLogin = driver.findElement(By.id("Button2"));
		btnLogin.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
