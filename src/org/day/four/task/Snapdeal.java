package org.day.four.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	public static void main(String[] args) {
		System.out.println("Snap Deal");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		WebElement txtSearch = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtSearch.sendKeys("mobile cover");
		WebElement clkSearch = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", clkSearch);
		WebElement first = driver.findElement(By.xpath("(//picture[@class='picture-elem'])[1]"));
		first.click();
		//Actions acc = new Actions(driver);
		//acc.moveToElement(clkSearch).click(clkSearch).perform();

	}
}