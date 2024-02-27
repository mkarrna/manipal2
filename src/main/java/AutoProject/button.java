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

public class button {
	static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		 
		driver.manage().window().maximize();
	
		
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"button-clicks\"]/div/div[1]/h1"));
		contact.click();
		Thread.sleep(1000);
		
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
				Thread.sleep(1000);
				
				//for normal button
				
						WebElement  button1 = driver.findElement(By.xpath("//span[@id='button1']"));
						button1.click();
						Thread.sleep(1000);
						WebElement  text = driver.findElement(By.xpath("//div[@class='modal-body']/p"));
						System.out.println(text.getText());
					
						WebElement  box = driver.findElement(By.xpath("//div[@class='modal-header']/button"));
						box.click();
				
				
				
				//for javascript click
				
						WebElement button2 = driver.findElement(By.xpath("//span[@id='button2']"));
						// Create an instance of JavascriptExecutor
			        	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	
			        	// Execute JavaScript click
			        	jsExecutor.executeScript("arguments[0].click();", button2);
			        	Thread.sleep(1000);
			        	
			        	WebElement  text1 = driver.findElement(By.xpath("//div[@class='modal fade in show']/div/div/div[2]/p"));
						System.out.println(text1.getText());
					
						WebElement  box1 = driver.findElement(By.xpath("//div[@class='modal fade in show']/div/div/div/button"));
						box1.click();
				
					
					
				// for move and clcik
				
							WebElement button3 = driver.findElement(By.xpath("//div[@class='caption']/span[@id='button3']"));
							Actions actions = new Actions(driver);
							
					        // Move to the element
					        actions.moveToElement(button3).perform();
			
					        button3.click();
							Thread.sleep(1000);
							WebElement  text2 = driver.findElement(By.xpath("//div[@id='myModalMoveClick']/div/div/div[2]/p"));
							System.out.println(text2.getText());
						
							WebElement  box2 = driver.findElement(By.xpath("//div[@id='myModalMoveClick']/div/div/div/button"));
							box2.click();

							Thread.sleep(1000);
							driver.quit();
				
			}
		
	}
 

	
}
