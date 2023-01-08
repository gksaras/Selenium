package org.hexa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskThree {
	public static void main(String[] args) {
		System.out.println("Automation Testing");
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\salin\\eclipse-workspace\\DayOneSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
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
		
		WebElement selectMale = driver.findElement(By.name("radiooptions"));
		selectMale.click();
		
		WebElement selectMovies = driver.findElement(By.id("checkbox2"));
		selectMovies.click(); 
		
		WebElement language = driver.findElement(By.xpath("//label[text()='Languages']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].scrollIntoView(true)", language);
		WebElement lang = driver.findElement(By.id("msdd"));
		js.executeScript("arguments[0].click()", lang);
		
		WebElement selectLang = driver.findElement(By.xpath("(//li[@class='ng-scope'])[8]"));
		js.executeScript("arguments[0].click()", selectLang);
		
		WebElement dropSkills = driver.findElement(By.id("Skills"));
		Select s = new Select(dropSkills);
		s.selectByVisibleText("Java");
		
		WebElement dropCountry = driver.findElement(By.id("country"));
		Select c = new Select(dropCountry);
		c.selectByVisibleText("India");
		
		WebElement dropYear = driver.findElement(By.id("yearbox"));
		Select y = new Select(dropYear);
		y.selectByValue("2000");
		
		WebElement dropMonth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select m = new Select(dropMonth);
		m.selectByIndex(7);
		
		WebElement dropDay = driver.findElement(By.id("daybox"));
		Select d = new Select(dropDay);
		d.selectByValue("20");
					
		WebElement txtPwd = driver.findElement(By.cssSelector("input[type ='password']"));
		txtPwd.sendKeys("bangtan@7");
		
		WebElement txtConfirmPwd = driver.findElement(By.id("secondpassword"));
		txtConfirmPwd.sendKeys("bangtan@7");
		
		WebElement btnSubmit = driver.findElement(By.id("submitbtn"));
		js.executeScript("arguments[0].click()", btnSubmit);
	}
}

