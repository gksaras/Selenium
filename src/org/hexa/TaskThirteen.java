package org.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskThirteen {
	public static void main(String[] args) {
		System.out.println("Myntra");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/\\r\\n");
		
		WebElement txtPhone = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		txtPhone.sendKeys("1234567890");
		WebElement btnContinue = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		btnContinue.click();
	}
}
