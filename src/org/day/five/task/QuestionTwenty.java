package org.day.five.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QuestionTwenty {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		//Thread.sleep(3000);
		
		WebElement btnX = driver.findElement(By.xpath("//button[text()='✕']"));
		btnX.click();
		
		//Thread.sleep(3000);
		
		WebElement display = driver.findElement(By.xpath("(//img[@class='kJjFO0 _3DIhEh'])[4]"));
		Actions act = new Actions(driver);
		act.moveToElement(display).doubleClick(display).perform();
		//Thread.sleep(3000);
		
		WebElement tvAppliances = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		act.moveToElement(tvAppliances).clickAndHold(tvAppliances).perform();
		
		WebElement miPhone = driver.findElement(By.xpath("//a[text()='Mi']"));
		act.moveToElement(miPhone).click(miPhone).perform();
		
		WebElement firstProduct = driver.findElement(By.xpath("(//div[@class='_2kHMtA'])[1]"));
		firstProduct.click();
	}
}
