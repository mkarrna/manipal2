package Manipal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class Table {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		List<WebElement> ls =driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println(ls.size());
		for(WebElement data: ls)
		{
			
			System.out.println(data.getText());
		}
		
		
		String str = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[4]")).getText();
		System.out.println(str);
		Thread.sleep(2000);
		
		driver.quit();
	}

}
