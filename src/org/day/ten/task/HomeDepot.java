package org.day.ten.task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Windows Handling");
		System.setProperty("webdriver.chrome.driver",
	   "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		//to maximize the window
		driver.manage().window().maximize();
		
		WebElement txtsearch = driver.findElement(By.id("headerSearch"));
		txtsearch.sendKeys("celling fan",Keys.ENTER);
		
		driver.get("https://www.homedepot.com/s/ceiling%20fan?NCNI-5");
		WebElement selectRemoteControl = driver.findElement(By.xpath("//h3[text()='Remote Included']"));
		selectRemoteControl.click();
		Thread.sleep(9000);
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		Set<String> allwindowId = driver.getWindowHandles();
		System.out.println(allwindowId);
		for (String eachWindowId : allwindowId) {
				driver.switchTo().window(eachWindowId);
		}
		WebElement firstProduct = driver.findElement(By.xpath("(//span[contains(text(),'Ashby')])[1]"));
		firstProduct.click();
	}
}
// switching to new windows if parent not equal to child
/*   if (!parentWindowId.equals(eachWindowId)) {
	driver.switchTo().window(eachWindowId);
} */
