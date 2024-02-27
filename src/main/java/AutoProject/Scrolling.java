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

public class Scrolling {
	static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		 
		driver.manage().window().maximize();
	
		
		WebElement contact = driver.findElement(By.xpath("//a[@id='scrolling-around']/div/div/h1"));
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
				
				WebElement elementToHover1 = driver.findElement(By.xpath("//div[@id='zone1']"));

		        // Create an instance of Actions class
		        Actions actions = new Actions(driver);

		        // Perform mouse hover action on the element
		        actions.moveToElement(elementToHover1).perform();
				
		        WebElement elementToHover2 = driver.findElement(By.xpath("//div[@id='zone2']")); 
		        WebElement elementToHover3 = driver.findElement(By.xpath("//div[@id='zone3']"));
		    
		        // Perform mouse hover action on the element
		        actions.moveToElement(elementToHover2).perform();
		        actions.moveToElement(elementToHover3).perform();
		        actions.moveToElement(elementToHover2).perform();
		        actions.moveToElement(elementToHover3).perform();
		        actions.moveToElement(elementToHover2).perform();
		        actions.moveToElement(elementToHover3).perform();
		        
		        System.out.println(elementToHover2.getText());
		        System.out.println(elementToHover3.getText());
		        
		        
		        //Scrolling
		        JavascriptExecutor jav = (JavascriptExecutor)driver;
				
				//vertical - up
				jav.executeScript("window.scrollBy(0,600)", "");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//vertical - up
				jav.executeScript("window.scrollBy(0,-200)", "");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//horizontal - left
				jav.executeScript("window.scrollBy(300,0)", "");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//horizontal - right
				jav.executeScript("window.scrollBy(-300,0)", "");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        
				String ele = driver.findElement(By.xpath("//div[@id='zone4']")).getText(); 
			     System.out.println(ele);
						
				
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							driver.quit();
				
			}
		
	}
 

	
}
