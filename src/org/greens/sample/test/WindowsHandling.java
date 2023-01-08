package org.greens.sample.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		
		driver.manage().window().maximize();
		//parent Window id
		String parentWindow = driver.getWindowHandle();
		
		WebElement homePage = driver.findElement(By.id("home"));
		homePage.click();
		
		//all Windows id - switch to new windows n times
		Set<String> allWindow = driver.getWindowHandles();
		for (String newWindow : allWindow) {
			driver.switchTo().window(newWindow);
		}
		
		WebElement editBox = driver.findElement(By.xpath("//h5[text()='Edit']"));
		editBox.click();
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		Thread.sleep(3000);
		
		WebElement multipleWindows = driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
		multipleWindows.click();
		
		//To count the number of windows opened
		int windowCount = driver.getWindowHandles().size();
		System.out.println("Number of Windows Opened = "+windowCount);
		
		WebElement dontCloseMe = driver.findElement(By.id("color"));
		dontCloseMe.click();
		
		//To handle the new windows - close all new opened windows except parent window
		Set<String> newWindowHandles = driver.getWindowHandles();
		for (String allWindows : newWindowHandles) {
			if (!allWindows.equals(parentWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}	
		}
		driver.quit();
	}
}
