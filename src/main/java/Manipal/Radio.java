package Manipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class Radio {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		
		Thread.sleep(2000);
		
		WebElement r1=driver.findElement(By.xpath("//label[1]/input[1]"));
		
		if(r1.isDisplayed())
		{
			r1.click();
		}
		else
		{
			System.out.println("not Found");
		}
		Thread.sleep(1000);
		WebElement r2=driver.findElement(By.xpath("//label[2]/input[1]"));
		
		if(r2.isDisplayed())
		{
			r2.click();
		}
		else
		{
			System.out.println("not Found");
		}
		
		Thread.sleep(10000);
		driver.quit();
	}

}
