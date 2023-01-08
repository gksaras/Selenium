package org.day.eleven.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", 
    "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	//driver.manage().window().maximize();
	
	WebElement table = driver.findElement(By.id("customers"));
	// 1.print all details from the table
/*	List<WebElement> tableRows = driver.findElements(By.tagName("tr"));
	for (int i = 0; i < tableRows.size(); i++) {
		WebElement rows = tableRows.get(i);
		String row = rows.getText();
		System.out.println(row);
		if(i==1) {
			break;
		}
		
	// 2.to print the value in the first row 	
		List<WebElement> tableRows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tableRows.size(); i++) {
			WebElement rows = tableRows.get(i);
			String row = rows.getText();
			System.out.println(row);
			if(i==1) {
				break;
			}  
			
	// 3.to print the number of rows
	List<WebElement> tableRows = driver.findElements(By.tagName("tr"));
	for (int i = 0; i < tableRows.size(); i++) {
		System.out.println(i);
	}  */
	
	// 5. to print the even rows of data from the table 
	List<WebElement> tableRows = driver.findElements(By.tagName("tr"));
	for (int i = 0; i < tableRows.size(); i=i+2) {
		WebElement rows = tableRows.get(i);
		String row = rows.getText();
		System.out.println(row);
	  /*	List<WebElement> tableData = rows.findElements(By.tagName("td"));
		for (int j = 0; j < tableData.size(); j++) {
			WebElement element = tableData.get(j);
			String text = element.getText();
			//if (text.equals("UK")) {
				System.out.println(text);
				//System.out.println(i);
				//System.out.println(j);

		//	}	
		}  */
	}
	
	}
}
