package org.sam;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement clsbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clsbtn.click();
		
		WebElement srchtxt = driver.findElement(By.xpath("//input[@name='q']"));
		srchtxt.sendKeys("mask",Keys.ENTER);
		
		WebElement imgMask = driver.findElement(By.xpath("//img[@alt='VeBNoR 100 Units Mask 3 Ply Surgical Mask (100 Piece) Surgical Mask']"));
		imgMask.click();
		
		String parWin = driver.getWindowHandle();
		System.out.println(parWin);
		
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
		
		for (String eachWin : allWin) {
			if (!parWin.equals(eachWin)) {
				driver.switchTo().window(eachWin);
				}
			}
		WebElement txtPin = driver.findElement(By.id("pincodeInputId"));
		txtPin.sendKeys("625001");
	}

}
