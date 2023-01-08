package org.day.six.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QuestionEleven {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");

		//driver.manage().window().maximize();
		
		WebElement btnX = driver.findElement(By.xpath("//button[text()='✕']"));
		btnX.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		WebElement selectProduct = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(selectProduct).contextClick(selectProduct).perform();
		
		Robot r = new Robot();
		for (int i = 0; i < 5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
