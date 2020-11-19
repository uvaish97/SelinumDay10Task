package org.sam;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement srchbox = driver.findElement(By.id("inputValEnter"));
		srchbox.sendKeys("iphone7",Keys.ENTER);
		
		WebElement imgapple = driver.findElement(By.xpath("//img[@title='Apple iPhone 7 Printed Cover By Tootena']"));
		imgapple.click();
		
		String parWin = driver.getWindowHandle();
		System.out.println(parWin);
		
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
		
		for (String eachWin : allWin) {
			if (!parWin.equals(eachWin)) {
				driver.switchTo().window(eachWin);
				
			}
		WebElement btnCart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		btnCart.click();
		
		WebElement price = driver.findElement(By.xpath("//span[text()='Rs. 399']"));
		price.getText();
			
		}
		
		
		
		
		
		
	}

}
