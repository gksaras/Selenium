package org.day.ten.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	
	public static void main(String[] args) {
		
		System.out.println("Windows Handling");
		
		System.setProperty("webdriver.chrome.driver",
	   "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtsrch = driver.findElement(By.id("inputValEnter"));
		txtsrch.sendKeys("iphones 7",Keys.ENTER);
		
		WebElement firstproduct = driver.findElement(By.xpath("(//picture[@class='picture-elem'])[1]"));
		firstproduct.click();
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		
		//switching and to get all windows id 
		Set<String> allWindowId=driver.getWindowHandles();
		System.out.println(allWindowId);
		
		List<String> eachWindowId = new ArrayList<>();
		eachWindowId.addAll(allWindowId);
		
		String windowId = eachWindowId.get(1);
		driver.switchTo().window(windowId);
		
		WebElement addToCart = driver.findElement(By.xpath("(//span[@class='intialtext'])[2]"));
		addToCart.click();
	}
}
