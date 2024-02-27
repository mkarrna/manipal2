package Manipal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkBox {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		Thread.sleep(2000);
		
		List <WebElement> r1= driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
		for(WebElement r : r1)
		{	
			
			r.click();
			Thread.sleep(5000);
		
		}
		
		driver.close();
	}

}
