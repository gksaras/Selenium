package org.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFour {
	public static void main(String[] args) {
		System.out.println("Toolsqa Automation");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement gotohome = driver.findElement(By.xpath("//a[text()='Go back to Homepage']"));
		gotohome.click();
		WebElement enroll = driver.findElement(By.xpath("(//a[contains(@class,'btn')])[1]"));
		enroll.click();
		WebElement txtFirstName = driver.findElement(By.name("firstName"));
		txtFirstName.sendKeys("Jack");
		WebElement txtLastName = driver.findElement(By.name("lastName"));
		txtLastName.sendKeys("Sparrow");
		WebElement txtmail = driver.findElement(By.id("email"));
		txtmail.sendKeys("sparrowjack@gmail.com");
		WebElement txtcity = driver.findElement(By.id("city"));
		txtcity.sendKeys("chennai");
		WebElement btnSend = driver.findElement(By.xpath("//button[text()='Send']"));
		btnSend.click();
		
	}
}

