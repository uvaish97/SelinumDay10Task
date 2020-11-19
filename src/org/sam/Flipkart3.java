package org.sam;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement clsbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clsbtn.click();
		WebElement srchtxt = driver.findElement(By.xpath("//input[@name='q']"));
		srchtxt.sendKeys("redmi phone",Keys.ENTER);
		WebElement imgPhone = driver.findElement(By.xpath("//img[@alt='Redmi 8A Dual (Midnight Grey, 32 GB)']"));
		imgPhone.click();
		
		String parWin = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();
		for (String eachWIn : allWin) {
			if(!parWin.equals(eachWIn));
			driver.switchTo().window(eachWIn);
			}
		WebElement price = driver.findElement(By.xpath("//div[contains(text(),'7,499')]"));
		String text = price.getText();
		System.out.println(text);
		}
		
}		

