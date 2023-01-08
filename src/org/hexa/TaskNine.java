package org.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskNine {
	public static void main(String[] args) {
		System.out.println("Flipkart");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement txtuser = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtuser.sendKeys("henry@gmail.com");
		WebElement txtpwd = driver.findElement(By.xpath("//input[@type='password']"));
		txtpwd.sendKeys("paradox");
		WebElement clkLogin= driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clkLogin.click();
	}
}
