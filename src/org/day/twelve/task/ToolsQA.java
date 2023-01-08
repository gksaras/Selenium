package org.day.twelve.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA {
	public static void main(String[] args) throws InterruptedException {
		
	System.out.println("Automation Demo Site");
	
	System.setProperty("webdriver.chrome.driver", 
    "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://toolsqa.com/");
	
	
	WebElement scrollDownFindUs = driver.findElement(By.xpath("/html/body/footer/div[2]/div[4]/div[1]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", scrollDownFindUs);
	Thread.sleep(5000);
	WebElement scrollUpArticles = driver.findElement(By.xpath("//a[text()='Latest Articles']"));
	js.executeScript("arguments[0].scrollIntoView(false)", scrollUpArticles);
	}
}
