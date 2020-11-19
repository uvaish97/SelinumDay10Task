package org.sam;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens1Task10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement btnClose = driver.findElement(By.xpath("//button[@class='close']"));
		btnClose.click();
		
		WebElement btnSel = driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(btnSel).perform();
		btnSel.click();
		
		WebElement btnTask = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
		btnTask.click();
		WebElement btnHan = driver.findElement(By.xpath("//button[text()='Windows Handling']"));
		btnHan.click();
		
		String parWin = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();
		for (String eachWin : allWin) {
			if (!parWin.equals(eachWin)) {
				driver.switchTo().window(eachWin);
				}
			}
		
		
	}

}
