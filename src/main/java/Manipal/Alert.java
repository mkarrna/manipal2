package Manipal;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.Gecko.driver","C:\\Program Files\\maven\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//ALERT
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.findElement(By.xpath("//input[@name='alert']")).click();

		Thread.sleep(2000);
		
		org.openqa.selenium.Alert al = driver.switchTo().alert();
		al.accept();
		//a1.dismiss();
		
		//CONFORMATION BOX
		
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();

		Thread.sleep(2000);
		
		org.openqa.selenium.Alert a2 = driver.switchTo().alert();
		a2.accept();
		//a2.dismiss();
		
		Thread.sleep(2000);
		
		//PROMPT
		
		driver.findElement(By.xpath("//input[@name='prompt']")).click();

		Thread.sleep(2000);
		
		org.openqa.selenium.Alert a3 = driver.switchTo().alert();
		a3.sendKeys("KARNA");
		Thread.sleep(1000);
		a3.accept();
		//a3.dismiss();
		
		Thread.sleep(2000);
		
		
		
	
		driver.quit();
	}

}
