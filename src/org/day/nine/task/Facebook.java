package org.day.nine.task;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("Drop Down");
		System.setProperty("webdriver.chrome.driver",
	   "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//to maximize the window
		driver.manage().window().maximize();
		
		WebElement btnCreateNewAc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnCreateNewAc.click();
		
		Thread.sleep(3000);
	
		WebElement dropDay = driver.findElement(By.id("day"));
		Select s1 = new Select(dropDay);
		s1.selectByValue("20");;
		List<WebElement> options1 = s1.getOptions();
		for (int i = 0; i < options1.size(); i++) {
			if (i%2 != 0) {
			WebElement element1 = options1.get(i);
			String text1 = element1.getText();
			System.out.println(text1);
			}
		}
		//s.selectByIndex(6);
		//s.selectByValue("7");
		
	    WebElement dropMonth = driver.findElement(By.id("month"));
	    Select s2 = new Select(dropMonth);
	 	s2.selectByVisibleText("Jul");	
	 	List<WebElement> options2 = s2.getOptions();
		for (int i = 0; i < options2.size(); i++) {
			WebElement element2 = options2.get(i);
			String text2 = element2.getText();
			System.out.println(text2);
		} 
		
		WebElement dropYear = driver.findElement(By.id("year"));
		Select s3=new Select(dropYear);
		s3.selectByValue("2000");
		List<WebElement> options3 = s3.getOptions();
		for (int i = 0; i < options3.size(); i++) {
			WebElement element3 = options3.get(i);
			String attribute = element3.getAttribute("value");
			System.out.println(attribute);
		} 
	}
}
