package org.sam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon1 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement txtsrc = driver.findElement(By.id("twotabsearchtextbox"));
		txtsrc.sendKeys("iphoneX",Keys.ENTER);
		
		WebElement imgphone = driver.findElement(By.xpath("//img[@alt='Apple iPhone XS Max, 256GB, Gold - For AT&T (Renewed)']"));
		
		Actions ac = new  Actions (driver);
		ac.contextClick(imgphone).perform();
		
		Robot robot = new  Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		String parWin = driver.getWindowHandle();
		System.out.println(parWin);
		
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
		
		for (String childWin : allWin) {
			if (!parWin.equals(childWin)) {
				driver.switchTo().window(childWin);
				}
			
			
		}
		
		
		
	}

}
