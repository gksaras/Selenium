package org.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFive {
	public static void main(String[] args) {
		System.out.println("Greens Tech");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement clkPlus = driver.findElement(By.id("heading20"));
		clkPlus.click();
		WebElement clkQuestion = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
		clkQuestion.click();
		
		//WebElement symbolPlus = driver.findElement(By.xpath("//div[@class='card-header1 d-flex align-items-center justify-]content-between collapsed']"));
		//symbolPlus.click();
		//WebElement txtFind = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
		//txtFind.click();
	}
}
