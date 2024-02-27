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
import org.openqa.selenium.devtools.v119.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import io.vavr.collection.List;

public class autoComplete {
	static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		
		driver.manage().window().maximize();
	
		
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"autocomplete-textfield\"]/div/div[1]/h1"));
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
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//for normal button
				
						WebElement  input = driver.findElement(By.xpath("//input[@id='myInput']"));
						input.sendKeys("ca");
						System.out.println("enter the key is \"ca\"");
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						WebElement  list = driver.findElement(By.xpath("//div[@id='myInputautocomplete-list']/div[2]"));
						System.out.println(list.getText());
						list.click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						WebElement  submit = driver.findElement(By.xpath("//input[@id='submit-button']"));
						submit.click();
						System.out.println("searcjing completed");
						
						
				//
	
				
				
							Thread.sleep(1000);
							driver.quit();
				
			}
		
	}
 

	
}
