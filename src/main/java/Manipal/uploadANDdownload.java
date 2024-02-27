package Manipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadANDdownload {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.Gecko.driver","C:\\Program Files\\maven\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		WebElement up=driver.findElement(By.xpath("//input[@name='upload']"));
		
		up.sendKeys("E:\\mainpal Academy\\REQU.pdf");
		Thread.sleep(1000);
		System.out.println(up.getText());
		
		driver.findElement(By.xpath("//input[@name='download']")).click();
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
