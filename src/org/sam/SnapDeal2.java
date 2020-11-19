package org.sam;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();

		WebElement srchbox = driver.findElement(By.id("inputValEnter"));
		srchbox.sendKeys("Hand Sanitizer",Keys.ENTER);
		
		WebElement imgapple = driver.findElement(By.xpath("//img[@title='Mirah Belle - Tea Tree & Aloe Vera LIQUID Hand Rub (2 L),(72.9% Alcohol) Hand Sanitizer 2000 mL Pack of 1']"));
		imgapple.click();
		
		String parWin = driver.getWindowHandle();
		System.out.println(parWin);
		
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
		
		for (String eachWin : allWin) {
			if (!parWin.equals(eachWin)) {
				driver.switchTo().window(eachWin);
				
			}
		}
		WebElement btnCart = driver.findElement(By.xpath("//span[text()='ADD TO CART']"));
		btnCart.click();
		
		WebElement price = driver.findElement(By.xpath("//span[text()='475']"));
		String Rs = price.getText();
		System.out.println(Rs);
			}
	
}
