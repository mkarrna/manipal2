package Manipal;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class scrollBar {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.Gecko.driver","C:\\Program Files\\maven\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		//driver.manage().window().maximize();
		
		JavascriptExecutor jav = (JavascriptExecutor)driver;
		
		//vertical - up
		jav.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(1000);
		
		//vertical - up
		jav.executeScript("window.scrollBy(0,-200)", "");
		Thread.sleep(1000);
		
		//horizontal - left
		jav.executeScript("window.scrollBy(300,0)", "");
		Thread.sleep(1000);
		
		//horizontal - right
		jav.executeScript("window.scrollBy(-300,0)", "");
		Thread.sleep(1000);
		
		//focus on your testing elements
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Meta © 2024')]"));
		jav.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		
		driver.quit();
		
		
	}

}
