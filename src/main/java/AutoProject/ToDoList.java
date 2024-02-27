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

public class ToDoList {
	static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		
		driver.manage().window().maximize();
	
		
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"to-do-list\"]/div/div[1]/h1"));
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
				
						WebElement  input = driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
						input.sendKeys("automation1");
						System.out.println(input.getText());
						input.sendKeys(Keys.ENTER);
						
						Thread.sleep(1000);
						
						input.sendKeys("automation2");
						System.out.println(input.getText());
						input.sendKeys(Keys.ENTER);
						
						WebElement  box = driver.findElement(By.xpath("//i[@id='plus-icon']"));
						box.click();
						System.out.println("items added successfuly");
						
				//
	
				
				
							Thread.sleep(1000);
							driver.quit();
				
			}
		
	}
 

	
}
