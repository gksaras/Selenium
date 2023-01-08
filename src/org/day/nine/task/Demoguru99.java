package org.day.nine.task;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoguru99 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("Drop Down");
		System.setProperty("webdriver.chrome.driver",
	   "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		WebElement dropCountry = driver.findElement(By.name("country"));
		Select s = new Select(dropCountry);
		s.selectByVisibleText("INDIA");
		List<WebElement> options = s.getOptions();
		// to print all options in the drop down 	// i=i+1 => to get odd options
		for (int i = 0; i < options.size(); i++) { // i=i+2 => to get even options
			WebElement element = options.get(i);
			String text = element.getText();
			System.out.println(text);
		}
	}
}
