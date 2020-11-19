package org.sam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensMouseover {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		WebElement btnCourses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(btnCourses).perform();
		WebElement btnPython = driver.findElement(By.xpath("//span[text()='Python']"));
		btnPython.click();
		
//		WebElement btnExplore = driver.findElement(By.xpath("//button[text()='Explore Curriculum']"));
//		WebElement btnExplore2 = driver.findElement(By.xpath("//h2[text()='Python Course Description']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true)",btnExplore2 );
//		ac.contextClick(btnExplore).perform();
//		Robot robot = new  Robot();
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
//		String parWin = driver.getWindowHandle();
//		Set<String> allWin = driver.getWindowHandles();
//		for (String eachWin : allWin) {
//			if (!parWin.equals(eachWin)) {
//				driver.switchTo().window(eachWin);
//				}
//			}
//		
		
		
		
		
	}

}
