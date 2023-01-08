package org.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwo {
	public static void main(String[] args) {
		System.out.println("Facebook");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//using xpath loactor---relative locator
		WebElement txtUser = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		txtUser.sendKeys("kang25@gmail.com");
		WebElement txtPwd = driver.findElement(By.xpath("//input[@type='password']"));
		txtPwd.sendKeys("dynasty");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@value='1']"));
		btnLogin.click();
		//xpath locator using Index
		WebElement btnCreateNewAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btnCreateNewAcc.click();
		//
	}
}
