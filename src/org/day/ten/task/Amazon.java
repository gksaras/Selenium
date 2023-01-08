package org.day.ten.task;

//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
	public static void main(String[] args) {
	
		System.out.println("Windows Handling");
		
		System.setProperty("webdriver.chrome.driver",
	   "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		//to maximize the window
		driver.manage().window().maximize();
		//Actions acc = new Actions(driver);
		//Robot r =new Robot();
		WebElement txtsrch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsrch.sendKeys("iphone X",Keys.ENTER);
		
		WebElement firstproduct = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		firstproduct.click();
		//WebElement iphone = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none _bXVsd_container_1DI1V _bXVsd_block_1vI8- _bXVsd_hFull_2lnNw _bXVsd_wFull_3f8b2 _bXVsd_row_3CEm0 _bXVsd_itemsCenter_3flfN']"));
		//acc.moveToElement(iphone).contextClick(iphone).perform();
	/*	for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);  */
		
		//to get parent window id
		String parWindowId = driver.getWindowHandle(); //0
		System.out.println(parWindowId);
		
		//to get all window id
		Set<String> allWindowId=driver.getWindowHandles(); //0 1
		System.out.println(allWindowId);
		
		List<String> eachWindowId=new ArrayList<>();
		eachWindowId.addAll(allWindowId);
		
		String windowId = eachWindowId.get(1);
		driver.switchTo().window(windowId);
		
		
		//to iterate the windows one by one
	/*	int count=0;
		for (String eachWindowId : allWindowId) {
			if (count==1) {
				driver.switchTo().window(eachWindowId);
			}
			count++; */
		/*	if (!parWindowId.equals(eachWindowId)) {
				driver.switchTo().window(eachWindowId);
			} */
		//} 
		
		WebElement productName = driver.findElement(By.id("productTitle"));
		String text = productName.getText();
		System.out.println(text);
		
		//WebElement btnAddToCart = driver.findElement(By.id("add-to-cart-button"));
		//btnAddToCart.click();
	}
}
