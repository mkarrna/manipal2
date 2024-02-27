package Manipal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class wedDriver_Commands {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
