package org.day.five.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		WebElement options = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		Actions acc = new Actions(driver);
		acc.moveToElement(options).perform();
		
		WebElement heels = driver.findElement(By.xpath("//span[text()='Heels']"));
		acc.moveToElement(heels).perform();
		heels.click();
	}
}
