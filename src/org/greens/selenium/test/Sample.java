package org.greens.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.in/");

		WebElement name = driver.findElement(By.cssSelector("input[type=text]"));
		name.sendKeys("Toys for kids");
	}
}
