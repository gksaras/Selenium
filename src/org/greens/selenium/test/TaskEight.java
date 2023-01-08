package org.greens.selenium.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskEight {
	
	public static void main(String[] args) {
		
	System.out.println("Instagram");
	
	System.setProperty("webdriver.chrome.driver", 
    "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/login/?hl=en)");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	
	WebElement txtUserName = driver.findElement(By.cssSelector("input[type = 'text']"));
	txtUserName.sendKeys("gk_strange");

	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','greens@gmail.com')", txtUserName);
	Object username = js.executeScript("return arguments[0].getAttribute('value')", txtUserName);
	String user = (String) username;
	System.out.println(user);
	
	WebElement txtPassword = driver.findElement(By.name("password"));
	txtPassword.sendKeys("multiverse");
	js.executeScript("arguments[0].setAttribute('value','hello@123')", txtPassword);
	//Object password = js.executeScript("return arguments[0].getAttribute('value')", txtPassword);
	String pass = (String) js.executeScript("return arguments[0].getAttribute('value')", txtPassword);;
	System.out.println(pass);
		
	}
}