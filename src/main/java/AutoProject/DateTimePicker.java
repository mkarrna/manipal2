package AutoProject;

import java.util.Iterator;
import java.util.List;
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

public class DateTimePicker {
	static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		
		driver.manage().window().maximize();
	
		
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"datepicker\"]/div/div[1]/h1"));
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
						WebElement  icon = driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-calendar']"));
						icon.click();
				
						WebElement  prev = driver.findElement(By.xpath("//table[@class=' table-condensed']/thead/tr[1]/th[1]"));
						prev.click();
						prev.click();
						prev.click();
						WebElement  next = driver.findElement(By.xpath("//table[@class=' table-condensed']/thead/tr[1]/th[1]"));
						next.click();
						next.click();
					
						List<WebElement>  days = driver.findElements(By.xpath("//table[@class=' table-condensed']/tbody/tr"));
						
						for(WebElement day: days)
						{
							day.click();
							String a=day.getText();
							if(a == "29")
								break;
						}
						
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						System.out.println("28-1-30");
						
							driver.quit();
				
			}
		
	}
 

	
}
