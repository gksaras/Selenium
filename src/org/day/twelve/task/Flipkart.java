package org.day.twelve.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement clkLogin = driver.findElement(By.xpath("//a[text()='Login']"));
		js.executeScript("arguments[0].click()", clkLogin);
		
	WebElement txtUserName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	
	js.executeScript("arguments[0].setAttribute('value','greens@gmail.com')", txtUserName);
	Object username = js.executeScript("return arguments[0].getAttribute('value')", txtUserName);
	String user = (String) username;
	System.out.println(user);
	
	WebElement txtPassword = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	js.executeScript("arguments[0].setAttribute('value','hello@123')", txtPassword);
	//Object password = js.executeScript("return arguments[0].getAttribute('value')", txtPassword);
	String pass = (String) js.executeScript("return arguments[0].getAttribute('value')", txtPassword);;
	System.out.println(pass);
	
	WebElement btnLogin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	js.executeScript("arguments[0].click()", btnLogin); 
}
}
