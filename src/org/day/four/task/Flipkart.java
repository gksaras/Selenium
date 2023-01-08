package org.day.four.task;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("Flipkart");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement btnCancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnCancel.click();
		
		WebElement search = driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));
		search.sendKeys("tshirts men",Keys.ENTER);
		
		Thread.sleep(3000);
		
		WebElement firstProduct = driver.findElement(By.xpath("(//img[@class='_2r_T1I'])[3]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", firstProduct);
		
		/*WebElement clkLogin= driver.findElement(By.xpath("//a[text()='Login']"));
		clkLogin.click();
		WebElement txtuser = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		txtuser.sendKeys("henry@gmail.com");
		String user = txtuser.getAttribute("value");
		System.out.println(user);
		WebElement txtpwd = driver.findElement(By.xpath("//input[@type='password']"));
		txtpwd.sendKeys("paradox");
		String password = txtpwd.getAttribute("value");
		System.out.println(password);*/
	}
		
}
