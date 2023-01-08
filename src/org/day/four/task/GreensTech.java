package org.day.four.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GreensTech {
	public static void main(String[] args) {
		System.out.println("Greens Tech");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");

		//tagName[text()='full text']
		WebElement txthead = driver.findElement(By.xpath("(//p[contains(text(),'Training')])[1]"));
		String head = txthead.getText();
		System.out.println(head);
		
		//tagName[contains(text(),'partially text')]
		WebElement findTxt = driver.findElement(By.xpath("//h1[text()='Selenium Certification Training in Chennai']"));
		String text = findTxt.getText();
		System.out.println(text);
		
		//xpath("//tagName[contains(@attribute name,'partially attribute value')]")-->syntax
		WebElement adyarAddress = driver.findElement(By.xpath("(//div[contains(@class,'widget')])[3]"));
		String adyar = adyarAddress.getText();
		System.out.println(adyar);
		
		WebElement omrAddress = driver.findElement(By.xpath("(//div[contains(@class,'widget')])[4]"));
		String omr = omrAddress.getText();
		System.out.println(omr);
		
		WebElement paragraph = driver.findElement(By.xpath("//p[contains(@class,'course-desc')]"));
		String para = paragraph.getText();
		System.out.println(para);
		
		
	}
}
