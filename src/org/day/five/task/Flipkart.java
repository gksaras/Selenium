package org.day.five.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		WebElement btnX = driver.findElement(By.xpath("//button[text()='✕']"));
		btnX.click();
		
		WebElement display = driver.findElement(By.xpath("(//img[@class='kJjFO0'])[1]"));
		Actions acc = new Actions(driver);
		acc.doubleClick(display).perform();
				
		WebElement clkhome = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		clkhome.click();
			
		WebElement bathTowels = driver.findElement(By.xpath("(//a[@class='_3QN6WI'])[30]"));
		acc.moveToElement(bathTowels).doubleClick(bathTowels).perform();
				
		WebElement productName= driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[1]"));
		productName.click();
		String text = productName.getText();
		System.out.println(text);
	}
}
