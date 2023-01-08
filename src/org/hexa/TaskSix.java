package org.hexa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSix {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Red Bus");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		WebElement findSign = driver.findElement(By.id("signin-block"));
		findSign.click();
		
		WebElement findSign_in = driver.findElement(By.id("signInLink"));
        findSign_in.click();
        
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
        driver.switchTo().frame(iframe);
        
        WebElement txtPhone = driver.findElement(By.id("mobileNoInp"));
        txtPhone.click();
        txtPhone.sendKeys("9876543210");
        
        //Thread.sleep(5000);
        
        WebElement captcha = driver.findElement(By.xpath("(//iframe[@title='reCAPTCHA'])[1]"));
        driver.switchTo().frame(captcha);
        WebElement robot = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
        robot.click();
       // Thread.sleep(15000);
       // driver.switchTo().frame(iframe);
        WebElement generateOTP = driver.findElement(By.xpath("//div[@class='otpContainer clearfix border-r-3 otp-margin-fix']"));
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", generateOTP);
   
	}
}

