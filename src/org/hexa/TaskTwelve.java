package org.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwelve {
	public static void main(String[] args) {
		System.out.println("Snap Deal");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		WebElement clkSignup = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		clkSignup.click();
		
		WebElement clkNewRegister = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		clkNewRegister.click();
		
		driver.switchTo().frame("loginIframe");
		
		WebElement txtuser = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
		txtuser.sendKeys("abcdefg@gmail.com");
		
		WebElement btnContinue = driver.findElement(By.id("checkUser"));
		btnContinue.click();
	}
}

