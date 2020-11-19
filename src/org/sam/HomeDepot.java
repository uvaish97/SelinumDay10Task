package org.sam;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement txtSearch = driver.findElement(By.id("headerSearch"));
		txtSearch.sendKeys("Ceiling fan",Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='Kensgrove 72 in. LED Indoor/Outdoor Espresso Bronze Ceiling Fan with Remote Control']")).click();;
		
		String parWin = driver.getWindowHandle();
		System.out.println(parWin);
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		
		for (String eachWin : allWindow) {
			if (!parWin.equals(eachWin)) {
				driver.switchTo().window(eachWin);
				}
			}
		WebElement btnRemote = driver.findElement(By.xpath("//span[text()='With Remote']"));
		btnRemote.click();
		
		
		
		
	}
}
