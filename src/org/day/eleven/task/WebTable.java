package org.day.eleven.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
			
	System.setProperty("webdriver.chrome.driver", 
    "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/write-xpath-table.html");
	
	//driver.manage().window().maximize();
	
	WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
	
	List<WebElement> tableRows = driver.findElements(By.tagName("tr"));
	for (int i = 0; i < tableRows.size(); i++) {
		WebElement row = tableRows.get(i);
		List<WebElement> tableData = row.findElements(By.tagName("td"));
		for (int j = 0; j < tableData.size(); j++) {
			WebElement data = tableData.get(j);
			String text = data.getText();
			System.out.println(text);
		}
	}
	}
}
