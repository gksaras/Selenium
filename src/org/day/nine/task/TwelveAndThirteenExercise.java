package org.day.nine.task;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TwelveAndThirteenExercise {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("Drop Down");
		System.setProperty("webdriver.chrome.driver",
	   "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		
		WebElement dropFruits = driver.findElement(By.id("fruits"));
		Select s = new Select(dropFruits);
		//Dimension size = dropFruits.getSize();
		//System.out.println(size);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		List<WebElement> options = s.getOptions();
		int notselected = 0;
		for (int i = 0; i < options.size(); i++) {
			if(i%2 != 0) {
				s.selectByIndex(i);
				WebElement element = options.get(i);
				String text = element.getText();
				System.out.println(text);
			}
			else {
				notselected++;
			}
		}
		System.out.println(notselected);
		
	/*	List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
				s.selectByIndex(i);
				WebElement element = options.get(i);
				String text = element.getText();
				System.out.println(text);

		} */
	}
}
