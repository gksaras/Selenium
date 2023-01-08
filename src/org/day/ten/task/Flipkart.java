package org.day.ten.task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) {
		
		System.out.println("Windows Handling");
		
		System.setProperty("webdriver.chrome.driver",
	   "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		WebElement txtsrch = driver.findElement(By.name("q"));
		txtsrch.sendKeys("redmi phone",Keys.ENTER);
		
		driver.get("https://www.flipkart.com/search?q=redmi%20phone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		WebElement firstProduct = driver.findElement(By.cssSelector("img[alt='REDMI 10A (Charcoal Black, 64 GB)']"));
		firstProduct.click();
		
		String parWindowId = driver.getWindowHandle();
		System.out.println(parWindowId);
		
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId);
		
		for (String eachWindowId : allWindowId) {
			if (!parWindowId.equals(eachWindowId)) {
				driver.switchTo().window(eachWindowId);
			}
		}
		
		WebElement txtPrice = driver.findElement(By.xpath("(//div[text()='₹8,879'])[1]"));
		String price = txtPrice.getText();
		System.out.println(price);
		
		
		WebElement btnAddToCart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		btnAddToCart.click();
	}
}
