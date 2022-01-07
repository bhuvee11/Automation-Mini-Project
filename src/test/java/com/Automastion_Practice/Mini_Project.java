package com.Automastion_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhuvanesh\\eclipse-workspace\\Automastion_Practice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("bhuvanesh11s@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("8012345066");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.xpath("//a[@title='Women']"));
		Actions a = new Actions(driver);
		a.moveToElement.build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
