package org.greens.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSix {
	public static void main(String[] args) {
		
	System.out.println("Swiggy");
	
	System.setProperty("webdriver.chrome.driver", 
    "C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=google_search_sok_food_na_narm_order_web_m_web_clubbedcities_neev_brand_newuser_v1_v2_brand_em&gclid=Cj0KCQjwnP-ZBhDiARIsAH3FSRfh0RlRySOhMwQa5IdCOETBmcw0X-Rnbx6uguc3aCzkRGnbyxyKaZUaAgS0EALw_wcB");
	WebElement txtLocation = driver.findElement(By.id("location"));
	txtLocation.sendKeys("Navalur");
	}
}