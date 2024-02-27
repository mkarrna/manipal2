package Manipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.Gecko.driver","C:\\Program Files\\maven\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		Actions ac =new Actions(driver);
		WebElement wb = driver.findElement(By.xpath("//input[@value='Double Click Me']"));
		Thread.sleep(2000);
		
		ac.doubleClick(wb).perform();
		Thread.sleep(2000);
		
		org.openqa.selenium.Alert al = driver.switchTo().alert();
		al.accept();
		https://the-internet.herokuapp.com/drag_and_drop
		
		Thread.sleep(2000);
		ac.contextClick(wb).perform();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
