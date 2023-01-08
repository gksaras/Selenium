package org.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskEleven {
	public static void main(String[] args) {
		System.out.println("Google");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement txtFirstName = driver.findElement(By.name("firstName"));
		txtFirstName.sendKeys("Jack");
		WebElement txtLastName = driver.findElement(By.name("lastName"));
		txtLastName.sendKeys("Sparrow");
		WebElement txtUser = driver.findElement(By.name("Username"));
		txtUser.sendKeys("jacksparrow@gmail.com");
		WebElement txtPwd = driver.findElement(By.name("Passwd"));
		txtPwd.sendKeys("blackpearl");
		WebElement txtConfirmPwd = driver.findElement(By.name("ConfirmPasswd"));
		txtConfirmPwd.sendKeys("blackpearl");
		WebElement clkNext = driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"));
		clkNext.click();
		
	}
}

