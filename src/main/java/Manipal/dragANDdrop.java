package Manipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragANDdrop {
	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.Gecko.driver","C:\\Program Files\\maven\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		Actions ac =new Actions(driver);
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement wb2 = driver.findElement(By.xpath("//div[@id='column-b']"));
	//multiselect
		ac.dragAndDrop(wb1, wb2).build().perform();
		Thread.sleep(2000);
		
		
		
		driver.quit();
	}

}
