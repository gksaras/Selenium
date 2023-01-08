package org.day.eight.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {
	public static void main(String[] args) {
		System.out.println("HDFC Bank Alert");
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();

	//	WebElement frameset1 = driver.findElement(By.xpath("//frameset[@rows='*']"));
	//	driver.switchTo().frame(frameset1);
	//	WebElement frameset2 = driver.findElement(By.xpath("//frameset[@rows='*,30']"));
	//	driver.switchTo().frame(frameset2);
	//	WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
		
		//switching to frame  => frame(String name/id)
		driver.switchTo().frame("login_page");
		
		WebElement userId = driver.findElement(By.name("fldLoginUserId"));
		userId.sendKeys("hdfc2012");
		
		WebElement btnContinue = driver.findElement(By.xpath("//a[@onclick='return fLogon();']"));
		btnContinue.click(); 
		
		WebElement password = driver.findElement(By.name("fldPassword"));
		password.sendKeys("secure@20");
		
		WebElement btnLogin = driver.findElement(By.xpath("//a[@onclick='return fLogon();']"));
		btnLogin.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
