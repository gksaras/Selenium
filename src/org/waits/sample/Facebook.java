package org.waits.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	/* Waits(2 types)
	   1. static wait => Thread.sleep(millisecs)
	   2. dynamic wait => ignores the time when it founded(WebElement)
	  
	   Dynamic wait(2 types)
	   1. implicit wait => driver.manage().timeouts().implicitlyWait(timeout,Timeunit.SECONDS);
	   2. explicit wait
	   
	   Explicit wait(2 types)
	   1. WebDriver Wait => can't handle exceptions and can't able to set intervals
	   2.fluent wait => can handle exceptions and able to set intervals
	   	   
	*/
	// implicit wait -> applicable for all locators.
	/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebElement txtUser = driver.findElement(By.id("email"));
	txtUser.sendKeys("greens@gmail.com"); */
	
	// explicit wait - used for particular locator only
	// 1. WebDriver Wait
	WebDriverWait wwt = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement txtUser = wwt.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	txtUser.sendKeys("greens@gmail.com");
	
	// 2. Fluent wait (Wait -> Interface)
	Wait<WebDriver> fwt = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(Throwable.class);
	Object obj = fwt.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass")));
	WebElement txtPassword = (WebElement)obj;
	txtPassword.sendKeys("greens@123");
	
	driver.quit();

}
}
