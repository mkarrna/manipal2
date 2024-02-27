package Manipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calender {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.Gecko.driver","C:\\Program Files\\maven\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@aria-label='Tue Feb 27 2024']")).click();
		
		Thread.sleep(1000);
		
		
		driver.quit();
		
		
	}

}
