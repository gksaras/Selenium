package org.day.seven.task;

//import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Question 5
	/*	WebElement jobOpenings = driver.findElement(By.xpath("(//h2[contains(text(),'Job')])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)", jobOpenings);
		Thread.sleep(5000);
		WebElement onlineClasses = driver.findElement(By.xpath("//h3[text()='Online Classroom']"));
		js.executeScript("arguments[0].scrollIntoView(false)", onlineClasses); */
		
		//Question 6
		//WebElement seleniumTrends = driver.findElement(By.id("headingOne"));
		//js.executeScript("arguments[0].scrollIntoView(true)", seleniumTrends);
		
		//Question 8
		//WebElement coreJava = driver.findElement(By).xpath("//h2[contains(text(),'Core')]"));
		//js.executeScript("arguments[0].scrollIntoView(true)", coreJava);
		
		//Question 7
		WebElement interviewQuestions = driver.findElement(By.xpath("//h2[contains(text(),'Interview')]"));
		act.moveToElement(interviewQuestions).click(interviewQuestions).perform();
		//js.executeScript("arguments[0].click()", interviewQuestions);
		
		//To take screenshot
		/*TakesScreenshot tk = (TakesScreenshot)driver;//downcasting(or)typecasting
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);//stores in temporary loaction
		
		//To store in selected location
		File dest = new File("C:\\Users\\salin\\OneDrive\\Pictures\\Saved Pictures\\GreensTechnologies.png");
	    FileUtils.copyFile(src, dest);*/
		}
}
