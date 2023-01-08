package org.day.five.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QuestionFive {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://bazaar.shopclues.com/branded-deals.html");
		//to maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions act = new Actions(driver);
		act.moveToElement(sports).clickAndHold(sports).perform();
		
		WebElement weightGainers = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		act.moveToElement(weightGainers).click(weightGainers).perform();
	}
}
