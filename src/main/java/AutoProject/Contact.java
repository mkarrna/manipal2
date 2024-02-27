package AutoProject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Contact {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");		
		driver.manage().window().maximize();
		
		// get the parent window handle
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Thread.sleep(500);
		
		
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"contact-us\"]/div/div[1]/h1"));
		contact.click();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		Iterator<String>  itr = allWindows.iterator();
		while(itr.hasNext()) 
		{
			String childwindow = itr.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) 
			{
				driver.switchTo().window(childwindow);
	
				WebElement fName = driver.findElement(By.xpath("//form[@id='contact_form']/input[1]"));
				WebElement lName = driver.findElement(By.name("last_name"));
				WebElement email = driver.findElement(By.name("email"));
				WebElement message = driver.findElement(By.name("message"));
				WebElement reset = driver.findElement(By.xpath("//input[@value='RESET']"));
				WebElement submit = driver.findElement(By.xpath("//input[@value='SUBMIT']"));
				Thread.sleep(1000);
				
				// Reset button working
				fName.sendKeys("karna");
				lName.sendKeys("mogaveer");
				email.sendKeys("karuna.n799@gmail.com");
				message.sendKeys("this is automation project..");
				Thread.sleep(1000);
				reset.click();
				Thread.sleep(1000);
				System.out.println("reset done");
				
				//submit button working
				Thread.sleep(1000);
				fName.sendKeys("karna");
				lName.sendKeys("mogaveer");
				email.sendKeys("karuna.n799@gmail.com");
				message.sendKeys("this is automation project..");
				Thread.sleep(1000);
				submit.click();
				System.out.println("submit done");
				
				String window = driver.getWindowHandle();
				driver.switchTo().window(window);
				String msg = driver.findElement(By.xpath("//*[@id=\"contact_reply\"]/h1")).getText();
				System.out.println(msg);
				Thread.sleep(1000);
			}
			driver.switchTo().window(parentwindow);
		}	
		
		driver.quit();
	}

}
