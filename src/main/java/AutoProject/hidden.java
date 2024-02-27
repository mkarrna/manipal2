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

public class hidden {
	static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		 
		driver.manage().window().maximize();
	
		
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"hidden-elements\"]/div/div[1]/h1"));
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
						
						JavascriptExecutor js = (JavascriptExecutor) driver;
						
						
				        WebElement hiddenElement = (WebElement) js.executeScript("return document.getElementById('button1');");

						
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						hiddenElement.click();
						System.out.println("NOT DISPLAY ELEMENT");
						WebElement hiddenElement2 = (WebElement) js.executeScript("return document.getElementById('button2');");

						System.out.println("HIDDEN ELEMENT");
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						hiddenElement2.click();
		
						WebElement hiddenElement3 = (WebElement) js.executeScript("return document.getElementById('button3');");

						System.out.println("ZERO SIZE ELEMENT");
						
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						hiddenElement3.click();
						
						
						
				//
	
				
				
							Thread.sleep(1000);
							driver.quit();
				
			}
		
	}
 

	
}
