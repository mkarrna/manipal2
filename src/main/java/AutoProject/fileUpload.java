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

public class fileUpload {
	static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		
		driver.manage().window().maximize();
	
		
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"file-upload\"]/div/div[1]/h1"));
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
				
						WebElement  file = driver.findElement(By.xpath("//input[@id='myFile']"));
						file.sendKeys("E:\\mainpal Academy\\assignment\\assignment1.pdf");
						System.out.println("file inserted");
						WebElement  upload = driver.findElement(By.xpath("//input[@id='submit-button']"));
						upload.click();
						System.out.println("file uploading");
						
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						Alert al=driver.switchTo().alert();
						System.out.println(al.getText());
						al.accept();
						
						
						
				
	
				
				
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							driver.quit();
				
			}
		
	}
 

	
}
