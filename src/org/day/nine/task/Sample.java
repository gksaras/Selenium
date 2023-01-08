package org.day.nine.task;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("Drop Down");
		System.setProperty("webdriver.chrome.driver",
	   "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		
		driver.manage().window().maximize();
		
		WebElement dropDown = driver.findElement(By.name("multipleselect[]"));
		Select s = new Select(dropDown);
		s.selectByIndex(0);
		s.selectByValue("msmanual");
		s.selectByVisibleText("Agile Methodology");
		s.selectByIndex(3); 
		
		// to check multiple values can be selectable or not
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		//using for loop
	/*	List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
	 		s.selectByIndex(i);
			WebElement element = options.get(i);
			String text = element.getText();
			System.out.println(text);
		}  */
		
		//using enhanced for loop
	    List<WebElement> options = s.getOptions();
		for (WebElement select : options) {
			System.out.println(select.getText());
		} 
		
		//to get  selected options from dropdowwn
	/*	List<WebElement> options = s.getAllSelectedOptions();
		for (int i = 0; i < options.size(); i++) {
	 		s.selectByIndex(i);
			WebElement element = options.get(i);
			String text = element.getText();
			System.out.println(text);
		}  */
		
		//to get firstselected option from dropdown
	/*	WebElement firstSelectedOption = s.getFirstSelectedOption();
		String firsttext = firstSelectedOption.getText();
		System.out.println(firsttext); */
		
		//to deselect the selected opton from dropdown
	/*	s.deselectByIndex(0);
		s.deselectByValue("msmanual");
		s.deselectByVisibleText("Agile Methodology");
		s.deselectByIndex(3);
		s.deselectAll(); */
	}
}
