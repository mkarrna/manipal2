package AutoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class chrome {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		//https://chercher.tech/practice/practice-pop-ups-selenium-webdriver
		driver.quit();
	}

}
