package org.day.six.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//to maximize the window
		driver.manage().window().maximize();
		Actions acc = new Actions(driver);
		Robot r = new Robot();
	
		WebElement btnLogin = driver.findElement(By.xpath("//a[text()='Login']"));
		btnLogin.click();
		WebElement txtUser = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtUser.sendKeys("flipkart@gmail.com");
		
		acc.doubleClick(txtUser).perform();
	
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		
		WebElement txtPwd = driver.findElement(By.xpath("//input[@type='password']"));
		txtPwd.click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);  
		
		
	}
}
