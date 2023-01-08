package org.day.eight.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICIBank {
	public static void main(String[] args) {
		System.out.println("ICICI Bank");
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		//WebElement iframe = driver.findElement(By.xpath("//iframe[@class='resp-iframe']"));
		//driver.switchTo().frame("Revamp_Banner_ID");
		
		WebElement userId = driver.findElement(By.id("HDisplayDefault.Rb14"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", userId);
		js.executeScript("arguments[0].setAttribute('value','icici001')", userId);
		
		
	}
}
