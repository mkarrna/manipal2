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

public class DropDown {
	static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		 
		driver.manage().window().maximize();
	
		
		WebElement contact = driver.findElement(By.xpath("//a[@id='dropdown-checkboxes-radiobuttons']/div/div/h1"));
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
				
				//DROPDOWNLIST
				
					//LIST 1
						WebElement  list1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
						Select sel = new Select(list1);
						sel.selectByIndex(0);
						sel.selectByValue("python");
						sel.selectByVisibleText("SQL");
						System.out.println("SELECTED IN DROPDOWN");
						Thread.sleep(500);
						
					//LIST 2
						WebElement  list2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
						Select sel2 = new Select(list2);
						sel2.selectByIndex(0);
						sel2.selectByValue("maven");
						sel2.selectByVisibleText("TestNG");
						System.out.println("SELECTED IN LIST");
						Thread.sleep(500);
					
					//LIST 1
						WebElement  list3 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
						Select sel3 = new Select(list3);
						sel3.selectByIndex(0);
						sel3.selectByValue("css");
						sel3.selectByVisibleText("JavaScript");
				//CHECKBOX
						List <WebElement> r1= driver.findElements(By.xpath("//input[@type='checkbox']"));
						
						for(WebElement r : r1)
						{	
							String str = r.getText();
							System.out.println(str);
							r.click();
							Thread.sleep(500);
						
						}
						
				//RADIO BUTTON
						List <WebElement> r2= driver.findElements(By.xpath("//input[@type='radio']"));
						
							for(WebElement r : r2)
							{	
								String str = r.getText();
								System.out.println(str);
								r.click();
								Thread.sleep(500);
							
							}
						
				
				//SELECTED & DISABLED
							
							//radio
							List <WebElement> r3= driver.findElements(By.xpath("//form[@id='radio-buttons-selected-disabled']/input[@type='radio']"));
							
							for(WebElement r : r3)
							{	
								String str = r.getText();
								System.out.println(str);
								r.click();
								Thread.sleep(500);
							
							}
							
							
				
							//list
							WebElement  list4 = driver.findElement(By.xpath("//select[@id='fruit-selects']"));
							Select sel4 = new Select(list4);
							sel4.selectByIndex(0);
							sel4.selectByValue("pear");
							sel4.selectByVisibleText("Grape");
							
							
							Thread.sleep(1000);
							driver.quit();
							
			}
		
	}
 

	
}
