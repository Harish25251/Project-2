package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\FreshProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		WebElement frameElement = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(frameElement);
		
		WebElement customerId = driver.findElement(By.name("fldLoginUserId"));
		customerId.sendKeys("865resdg",Keys.ENTER);
		
		//WebElement findElement = driver.findElement(By.tagName("frame"));
		
		


		
		





	}

}
