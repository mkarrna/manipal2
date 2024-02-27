package Manipal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.vavr.collection.List;

public class iframe {
	static WebDriver  dr;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://letcode.in/frame");
		
		dr.switchTo().frame("firstFr");
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.findElement(By.name("fname")).sendKeys("karunakara");
		
		WebElement el= dr.findElement(By.xpath("//iframe[@src='innerFrame']"));
		
		dr.switchTo().frame(el);
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.findElement(By.name("email")).sendKeys("karunakara@gmail.com");
		

	}
	
}
