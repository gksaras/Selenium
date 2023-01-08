package org.day.ten.task;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionEleven {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("Windows Handling");
		
		System.setProperty("webdriver.chrome.driver",
	   "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement btnX = driver.findElement(By.xpath("//button[text()='✕']"));
		btnX.click();
		
		WebElement txtsrch = driver.findElement(By.name("q"));
		txtsrch.sendKeys("hp laptop",Keys.ENTER);
		
		Thread.sleep(3000);

		WebElement firstProduct = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[1]"));
		firstProduct.click();
		
		String parWindowId = driver.getWindowHandle();
		System.out.println(parWindowId);
		
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId);
		
		for (String eachWindowId : allWindowId) {
			//if (!parWindowId.equals(eachWindowId)) {
				driver.switchTo().window(eachWindowId);
			//}
		}
		
		WebElement txtPrice = driver.findElement(By.xpath("(//div[text()='₹41,990'])[1]"));
		String price = txtPrice.getText();
		System.out.println(price);	
		
	}
}
