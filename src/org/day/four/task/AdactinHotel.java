package org.day.four.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {
	public static void main(String[] args) {
		System.out.println("Adactin Hotel");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("kang");
		String user = txtUser.getAttribute("value");
		System.out.println(user);
		WebElement txtPwd = driver.findElement(By.name("password"));
		txtPwd.sendKeys("timeline");
		String password = txtPwd.getAttribute("value");
		System.out.println(password);
	}
}
