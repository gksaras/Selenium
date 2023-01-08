package org.day.four.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {
	public static void main(String[] args) {
		System.out.println("Greens Technologies");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement findtxt = driver.findElement(By.xpath("//h1[contains(text(),'with')]"));
		String text = findtxt.getText();
		System.out.println(text);
		WebElement findtxt1 = driver.findElement(By.xpath("//p[contains(text(),'is')]"));
		String text1 = findtxt1.getText();
		System.out.println(text1);
		
		
		

		
	}
}
