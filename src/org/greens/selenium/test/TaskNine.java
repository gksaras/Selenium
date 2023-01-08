package org.greens.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskNine {
	public static void main(String[] args) {
		
	System.out.println("Automation Demo Site");
	
	System.setProperty("webdriver.chrome.driver", 
    "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	//using tagName 
	WebElement txtFirstName = driver.findElement(By.tagName("input"));
	txtFirstName.sendKeys("John");
	//using cssSelector
	WebElement txtLastName = driver.findElement(By.cssSelector("input[placeholder = 'Last Name']"));
	txtLastName.sendKeys("Walker");
	WebElement txtAddress = driver.findElement(By.cssSelector("textarea[rows ='3']"));
	txtAddress.sendKeys("No.3 Rajiv Gandhi Salai,O.M.R,Navalur,Chennai-600130");
	WebElement txtEmail = driver.findElement(By.cssSelector("input[ng-model = 'EmailAdress']"));
	txtEmail.sendKeys("johnwalk@gmail.com");
	WebElement txtPhone = driver.findElement(By.cssSelector("input[type ='tel']"));
	txtPhone.sendKeys("9876543012");
	WebElement txtPwd = driver.findElement(By.cssSelector("input[type ='password']"));
	txtPwd.sendKeys("bangtan@7");
	WebElement txtConfirmPwd = driver.findElement(By.id("secondpassword"));
	txtConfirmPwd.sendKeys("bangtan@7");
	
	
	}
}