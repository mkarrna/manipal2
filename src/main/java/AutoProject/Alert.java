package AutoProject;

import java.time.Duration;
import java.util.Iterator;

import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.vavr.collection.List;

public class Alert {
	static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		 
		driver.manage().window().maximize();
	
		
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"popup-alerts\"]/div/div[1]/h1"));
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
				
				//alert
				
						WebElement  alert1 = driver.findElement(By.id("button1"));
						alert1.click();
						org.openqa.selenium.Alert al1=driver.switchTo().alert();
						System.out.println(al1.getText());
						al1.accept();
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
				//prompt		
						WebElement  alert2 = driver.findElement(By.id("button2"));
						alert2.click();
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						WebElement  text = driver.findElement(By.xpath("//div[@class='modal-body']/p"));
						System.out.println(text.getText());
						System.out.println("prompt is loaded");
						WebElement  close = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button"));
						close.click();
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
				//ajax-loader		
						WebElement  alert3 = driver.findElement(By.id("button3"));
						alert3.click();
						
						WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
						WebElement key = wait.until(
								ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"button1\"]/p")));
						key.click();
						System.out.println("ajax loader");
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						String  text1 = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[2]/p")).getText();
						System.out.println(text1);
						driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[1]/button")).click();
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
					
	
				
				
							Thread.sleep(1000);
							driver.quit();
				
			}
		
	}
 

	
}
