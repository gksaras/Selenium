package org.greens.sample.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		//driver.manage().window().maximize();
	
		WebElement dropDown = driver.findElement(By.id("dropdown1"));
		
		Select s = new Select(dropDown);
		s.selectByIndex(0);
		s.selectByValue("1");
		s.selectByVisibleText("UFT/QTP");
		
		List<WebElement> optionsList = s.getOptions();
		int size = optionsList.size();
		System.out.println("Number of Elements = "+size);
		 
		dropDown.sendKeys("Loadrunner");
		
		WebElement selectMultiple = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		Select m = new Select(selectMultiple);
		boolean multiple = m.isMultiple();
		System.out.println(multiple);
		m.selectByVisibleText("Loadrunner");
		m.selectByIndex(1);
		m.selectByValue("2");
		
	}
}
