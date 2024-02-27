package Manipal;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.Gecko.driver","C:\\Program Files\\maven\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File("./Screenshot/omayo1.png"));
		
		Thread.sleep(1000);
		
		
		driver.quit();
		
		
	}

}
