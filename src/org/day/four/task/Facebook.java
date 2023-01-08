package org.day.four.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		
	System.out.println("Facebook");
	
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//tagName[contains(@attributeName,'partially attribute value')]
	WebElement txtUser = driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]"));
	txtUser.sendKeys("facebook@gmail.com");
	String user = txtUser.getAttribute("value");
	System.out.println(user);
	WebElement txtPwd = driver.findElement(By.xpath("//input[(@placeholder='Password')]"));
	txtPwd.sendKeys("facebook");
	String password = txtPwd.getAttribute("value");
	System.out.println(password);
	}
}
