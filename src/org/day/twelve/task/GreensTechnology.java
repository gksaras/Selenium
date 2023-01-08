package org.day.twelve.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {
	public static void main(String[] args) throws InterruptedException {
		
	System.out.println("Automation Demo Site");
	
	System.setProperty("webdriver.chrome.driver", 
    "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	
	WebElement scrollDownPorur = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", scrollDownPorur);
	
	WebElement getPorur = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
	String text = getPorur.getText();
	System.out.println(text);
	
	}
}
