package com.Automastion_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

public class Browser_Launch {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhuvanesh\\eclipse-workspace\\Automastion_Practice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement signin = driver.findElement(By.className("login"));
		signin.click();
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("bhuvanesh11s@gmail.com");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("8012345066");
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(women).build().perform();
		WebElement casual = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
		act.moveToElement(casual).build().perform();
		act.click().build().perform();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
