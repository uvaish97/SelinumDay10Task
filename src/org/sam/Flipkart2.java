package org.sam;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement clsbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clsbtn.click();
		
		WebElement srchtxt = driver.findElement(By.xpath("//input[@name='q']"));
		srchtxt.sendKeys("hp laptop",Keys.ENTER);
		
		WebElement imgLap = driver.findElement(By.xpath("//div[text()='HP 15 Ryzen 3 Dual Core 3200U - (4 GB/1 TB HDD/Windows 10 Home) 15-db1069AU Laptop']"));
		imgLap.click();
		
		String parWin = driver.getWindowHandle();
		System.out.println(parWin);
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
		
		for (String eachWin : allWin) {
			if (!parWin.equals(eachWin)) {
				driver.switchTo().window(eachWin);
				}
		}
		WebElement price = driver.findElement(By.xpath("//div[contains(text(),'30,')]"));
		String Rs = price.getText();
		System.out.println(Rs);
		
	}

}
