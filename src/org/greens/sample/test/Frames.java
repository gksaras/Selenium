package org.greens.sample.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		
		driver.manage().window().maximize();
		//switching driver to frame
		driver.switchTo().frame(0);//does not contains any attributes use index position
		
		WebElement btnOne = driver.findElement(By.id("Click"));
		btnOne.click();
		//to verify whether the button clicked or not
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		
		driver.switchTo().defaultContent();//getting back from frame
		//nested frame
		driver.switchTo().frame(1);//index position
		driver.switchTo().frame("frame2");//using frame id
		
		WebElement btnTwo = driver.findElement(By.id("Click1"));
		btnTwo.click();
		//to verify whether the button clicked or not
		String text2 = driver.findElement(By.id("Click1")).getText();
		System.out.println(text2);
		
		driver.switchTo().defaultContent();
		
		//to identify total count of frames using findElements and tagName
		 List<WebElement> frameCount = driver.findElements(By.tagName("iframe"));
		 int size = frameCount.size();
		 System.out.println(size);
	}
}
