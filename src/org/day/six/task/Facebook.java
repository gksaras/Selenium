package org.day.six.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//to maximize the window
		driver.manage().window().maximize();
		WebElement txtuser = driver.findElement(By.xpath("//input[@type='text']"));
		txtuser.sendKeys("abcdefgh");
		Actions acc = new Actions(driver);
		acc.doubleClick(txtuser).contextClick(txtuser).perform();
		
		Robot r = new Robot();
		//To cut the entered username
		for (int i = 0; i < 4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);	
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//to paste the text in password box
		WebElement txtPwd = driver.findElement(By.id("pass"));
		acc.moveToElement(txtPwd).contextClick(txtPwd).perform();
		for (int j = 0; j < 5; j++) {
			r.keyPress(KeyEvent.VK_DOWN);	
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
