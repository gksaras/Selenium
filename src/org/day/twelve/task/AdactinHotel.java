package org.day.twelve.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','greens@gmail.com')", txtUserName);
		Object username = js.executeScript("return arguments[0].getAttribute('value')", txtUserName);
		String user = (String) username;
		System.out.println(user);
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','hello@123')", txtPassword);
		//Object password = js.executeScript("return arguments[0].getAttribute('value')", txtPassword);
		String pass = (String) js.executeScript("return arguments[0].getAttribute('value')", txtPassword);
		System.out.println(pass);
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btnLogin);
	}
}
