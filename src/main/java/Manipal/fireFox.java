package Manipal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class fireFox {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.Gecko.driver","C:\\Program Files\\maven\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		driver.quit();
	}

}
