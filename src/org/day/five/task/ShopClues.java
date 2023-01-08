package org.day.five.task;

import java.time.Duration;
import java.util.Set;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://bazaar.shopclues.com/branded-deals.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		WebElement phone = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(phone).perform();
		
		WebElement smartphones = driver.findElement(By.xpath("//strong[text()='Smartphones & Tablets']"));
		acc.click(smartphones).perform();
				
		Set<String> allWindow = driver.getWindowHandles();
		for (String eachWindow : allWindow) {
			driver.switchTo().window(eachWindow);
		}
		
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		
		WebElement range = driver.findElement(By.xpath("//label[@for='Above 5000']"));
		acc.moveToElement(range).click(range).perform();;
	}
}
