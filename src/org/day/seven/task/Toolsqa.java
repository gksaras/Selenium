package org.day.seven.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqa {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/");
		driver.manage().window().maximize();
		
		WebElement recentArticles = driver.findElement(By.xpath("//a[text()='Latest Articles']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", recentArticles);
		
		WebElement readMore = driver.findElement(By.xpath("//a[text()='Read More']"));
		js.executeScript("arguments[0].scrollIntoView(true)", readMore);
		js.executeScript("arguments[0].click()", readMore);
		
		
		//To take screenshot
		TakesScreenshot tk = (TakesScreenshot)driver;//downcasting(or)typecasting
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);//stores in temporary loaction
		
		//To store in selected location
		File dest = new File("C:\\Users\\salin\\OneDrive\\Pictures\\Saved Pictures\\toolsqa.png");
	    FileUtils.copyFile(src, dest);
		}
}
