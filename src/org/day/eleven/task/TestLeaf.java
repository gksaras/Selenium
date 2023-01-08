package org.day.eleven.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeaf {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", 
    "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://testleaf.herokuapp.com/pages/table.html");
	
	//driver.manage().window().maximize();
	
	WebElement table = driver.findElement(By.tagName("table"));
	
	List<WebElement> tableRows = driver.findElements(By.tagName("tr"));
	// to get all rows includes heading and data
	for (WebElement eachRow : tableRows) {
		String text = eachRow.getText();
		System.out.println(text);
	}
	// to get the heading only from the table
	List<WebElement> tableHeadings = driver.findElements(By.tagName("th"));
	for (WebElement heading : tableHeadings) {
		String head = heading.getText();
		System.out.println(head);
	}
	// to get all the data only from the table
	List<WebElement> tableDatas = driver.findElements(By.tagName("td"));
	for (WebElement datas : tableDatas) {
		String data = datas.getText();
		System.out.println(data);
	}
	// to count number of rows present in the table
	for (int i = 0; i < tableRows.size(); i++) {
		System.out.println(i);
	}
	}
}
