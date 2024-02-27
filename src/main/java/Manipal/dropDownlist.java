package Manipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownlist {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.dummypoint.com/seleniumtemplate.html");
		WebElement wb2 = driver.findElement(By.xpath("//select[@id='multiselect']"));
		Select sel = new Select(wb2);
		sel.selectByVisibleText("mOption2");
		sel.selectByValue("mOptionOne");
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.deselectByIndex(2);
		Thread.sleep(2000);
		sel.deselectByValue("mOptionOne");
		Thread.sleep(2000);
		sel.deselectByVisibleText("mOption2");
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
