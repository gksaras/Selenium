package org.day.eight.task;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws AWTException {
		System.out.println("HDFC Bank");
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("steven");
		WebElement txtuser = driver.findElement(By.xpath("/html/body/div[1]/form/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/input"));
		txtuser.sendKeys("steven");
		//WebElement btnContinue = driver.findElement(By.xpath("//a[@onclick='return fLogon();']"));
		//btnContinue.click();
		
	}
}
