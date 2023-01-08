package org.greens.sample.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement getLine = driver.findElement(By.xpath("//h2[contains(text(),'helps')]"));
		String text = getLine.getText();
		System.out.println(text);
		
		WebElement txtUser = driver.findElement(By.id("email"));
		boolean displayed = txtUser.isDisplayed();
		System.out.println(displayed);
		boolean enabled = txtUser.isEnabled();
		System.out.println(enabled);
		if(displayed == enabled) {
			txtUser.sendKeys("gkdynasty@gmail.com");
		}
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("multiverse@25");
		WebElement visibleText = driver.findElement(By.xpath("//div[@class='_9lsa']"));
		visibleText.click();
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(3000); 
		
		WebElement btnCreateNewAc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btnCreateNewAc.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtFirstName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		js.executeScript("arguments[0].setAttribute('value','Stephen')", txtFirstName);
		
		WebElement txtLastName = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		js.executeScript("arguments[0].setAttribute('value','Strange')", txtLastName);
		
		WebElement txtMobile = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		js.executeScript("arguments[0].setAttribute('value','9876543210')", txtMobile);
		
		WebElement txtNewPassword = driver.findElement(By.id("password_step_input"));
		js.executeScript("arguments[0].setAttribute('value','secretwars@26')", txtNewPassword);
		
		WebElement dropDay = driver.findElement(By.id("day"));
		Select d = new Select(dropDay);
		d.selectByValue("20");
		WebElement dropMonth = driver.findElement(By.id("month"));
		Select m = new Select(dropMonth);
		m.selectByIndex(6);
		WebElement dropYear = driver.findElement(By.id("year"));
		Select y = new Select(dropYear);
		y.selectByVisibleText("2000");
		//to checked whether the radio button is clicked or not
		WebElement radioMale = driver.findElement(By.xpath("//label[text()='Male']"));
		boolean g= radioMale.isSelected();
		System.out.println(g);
		if (g == false){
		radioMale.click();
		}
		WebElement btnSignup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btnSignup.click();	
	}
}
