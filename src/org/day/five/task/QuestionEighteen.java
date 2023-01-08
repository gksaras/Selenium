	package org.day.five.task;
	
	import java.time.Duration;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	
	public class QuestionEighteen {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					 "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			//driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			//Thread.sleep(3000);
			
			WebElement btnX = driver.findElement(By.xpath("//button[text()='✕']"));
			btnX.click();
			
			//Thread.sleep(3000);
			
			WebElement display = driver.findElement(By.xpath("(//img[@class='kJjFO0'])[1]"));
			Actions acc = new Actions(driver);
			acc.moveToElement(display).doubleClick(display).perform();
			
			//Thread.sleep(3000);
			
			WebElement babyKids = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
			Actions act = new Actions(driver);
			acc.moveToElement(babyKids).perform();
			
			WebElement rcToys = driver.findElement(By.xpath("//a[text()='Remote Control Toys']"));
			act.moveToElement(rcToys).click(rcToys).perform();
		
		}
	}
