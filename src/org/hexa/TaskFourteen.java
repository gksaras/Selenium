package org.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFourteen {
	public static void main(String[] args) {
		System.out.println("Swiggy");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		WebElement clkSignup = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		clkSignup.click();
		WebElement txtMobile = driver.findElement(By.id("mobile"));
		txtMobile.sendKeys("1234567890");
		WebElement txtName = driver.findElement(By.name("name"));
		txtName.sendKeys("Joseph");
		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("joseph@gmail.com");
		WebElement txtPwd = driver.findElement(By.id("password"));
		txtPwd.sendKeys("password");
		WebElement btnContinue= driver.findElement(By.xpath("//a[@class='a-ayg']"));
		btnContinue.click();
	}
}
