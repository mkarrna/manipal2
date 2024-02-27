package AutoProject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import io.vavr.collection.List;

public class Iframe {
	static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		 
		driver.manage().window().maximize();
	
		
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"iframe\"]/div/div[1]/h1"));
		contact.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// find current Window
		String currentWin = driver.getWindowHandle();
		
		// list all windows
		Set<String> childwindow = driver.getWindowHandles();
		System.out.println(childwindow);
		for(String win : childwindow)
			
			// check current window is selected window 
			if (!win.equals(currentWin))	
			{
				// if not current window , then switch to selected window
				
				driver.switchTo().window(win);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//for normal button
				
						WebElement  frame = driver.findElement(By.xpath("//iframe[@id='frame']"));
						driver.switchTo().frame(frame);
						WebElement  contact1 = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[3]/a"));
						contact1.click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						System.out.println("switched to childeframe ");
						System.out.println(win);
						driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
						Thread.sleep(1000);
						driver.switchTo().window(currentWin);
						Thread.sleep(1000);
						System.out.println("switched back to parentframe ");
						String currentWin1 = driver.getWindowHandle();
						System.out.println(currentWin1);
						
						
						
						
						
						
				
	
				
				
							
							driver.quit();
				
			}
		
	}
 

	
}
