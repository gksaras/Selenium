package org.day.seven.task;

//import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filpkart {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//Question 9
	/*	WebElement txtsrch = driver.findElement(By.name("q"));
		txtsrch.sendKeys("iphone");
		WebElement btnsrch = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		btnsrch.click();  */
		
		Actions acc = new Actions(driver);
		WebElement image = driver.findElement(By.xpath("(//img[@class='kJjFO0'])[2]"));
		acc.moveToElement(image).doubleClick(image).perform();
		
		driver.navigate().to("https://www.flipkart.com/big-diwali-sale-store?otracker=hp_bannerads_1_2.bannerAdCard.BANNERADS_s_4GKLFO8HIZZK");
		//WebElement women = driver.findElement(By.xpath("//span[text()='Women']"));
		//acc.moveToElement(women).perform();
		
		//Question 11
		WebElement babyKids = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		acc.moveToElement(babyKids).perform();
	
        
		//To take screenshot
	/*	TakesScreenshot tk = (TakesScreenshot)driver;//downcasting(or)typecasting
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);//stores in temporary loaction
		
		//To store in selected location
		File dest = new File("C:\\Users\\salin\\OneDrive\\Pictures\\Saved Pictures\\flipkart.png");
	    FileUtils.copyFile(src, dest); */
	}
}
