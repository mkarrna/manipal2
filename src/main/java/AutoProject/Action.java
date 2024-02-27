package AutoProject;

import java.sql.Time;
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

public class Action {
	static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		 
		driver.manage().window().maximize();
	
		
		WebElement contact = driver.findElement(By.xpath("//a[@id='actions']/div/div/h1"));
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
				
				//DRAG AND DROP
				
						Actions ac =new Actions(driver);
						WebElement wb1 = driver.findElement(By.xpath("//div[@id='draggable']"));
						WebElement wb2 = driver.findElement(By.xpath("//div[@id='droppable']"));
					
						ac.dragAndDrop(wb1, wb2).build().perform();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
									
				//double-click
									Actions ac1 =new Actions(driver);
									WebElement wb = driver.findElement(By.xpath("//div[@id='div-drag-drop-thumbnail']/div[@id='double-click']"));
									driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
									
									ac1.doubleClick(wb).perform();
									driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
									
									
									
									
				//mouse hover
								// first list
									WebElement elementToHover = driver.findElement(By.xpath("//div[@style='float:left;']/button"));

							        // Create an instance of Actions class
							        Actions actions = new Actions(driver);

							        // Perform mouse hover action on the element
							        actions.moveToElement(elementToHover).perform();

							        // Locate and click the item in the list
							        WebElement itemToSelect = driver.findElement(By.linkText("Link 1"));
							        itemToSelect.click();
							        
							        Alert al = driver.switchTo().alert();
							        
							        System.out.println(al.getText());
							        
							        al.accept();
							        
							    // Second list
									WebElement elementToHover1 = driver.findElement(By.xpath("//div[@style='float:center;']/button"));

							        

							        // Perform mouse hover action on the element
							        actions.moveToElement(elementToHover1).perform();

							        // Locate and click the item-1 in the list
							        WebElement itemToSelect1 = driver.findElement(By.xpath("//div[@style='float:center;']/div/a"));
							        itemToSelect1.click();
							        
							        Alert al1 = driver.switchTo().alert();
							        
							        System.out.println(al1.getText());
							        
							        al1.accept();
							        
							     // Third list
									WebElement elementToHover2 = driver.findElement(By.xpath("//div[@style='float:right;']/button"));

							        

							        // Perform mouse hover action on the element
							        actions.moveToElement(elementToHover2).perform();

							        // Locate and click the item-1 in the list
							        WebElement itemToSelect11 = driver.findElement(By.xpath("//div[@style='float:right;']/div/a[1]"));
							        itemToSelect11.click();
							        
							        Alert al11 = driver.switchTo().alert();
							        
							        System.out.println(al11.getText());
							        
							        al11.accept();
							        
							     // Locate and click the item-2 in the list
							        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							        WebElement itemToSelect12 = driver.findElement(By.xpath("//div[@style='float:right;']/div/a[2]"));
							        itemToSelect12.click();
							        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							        Alert al12 = driver.switchTo().alert();
							        
							        System.out.println(al12.getText());
							        
							        al12.accept();
							        
			        
							        
							        
							        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
									driver.quit();
				
			}
		
	}
 

	
}
