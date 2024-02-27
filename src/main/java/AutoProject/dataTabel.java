package AutoProject;
 
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class dataTabel {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
	
				WebDriver driver=new ChromeDriver();
				driver.get("https://webdriveruniversity.com/Data-Table/index.html#");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				List<WebElement> rownumber = driver.findElements(By.xpath("//table[@id='t01']/tbody/tr"));
				int rowcount = rownumber.size();
				
				
				System.out.println("Rowcount: "+rowcount);
				
				List<WebElement>colno=driver.findElements(By.xpath("//table[@id='t01']/tbody/tr[2]/td"));
				int colcnt=colno.size();
				System.out.println("colmn count: "+colcnt);
				WebElement cellfetch=driver.findElement(By.xpath("//*[@id='t02']/tbody/tr[3]/td[1]"));
				String resultxt=cellfetch.getText();
				String ExpectedText="karna";
				System.out.println(resultxt);
				if(resultxt.equals(ExpectedText))
				{
					
					System.out.println("valid Data fetch");
				}
				else
				{
					System.out.println("wrong input or no data found");
				}
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement firstnme=driver.findElement(By.xpath("//input[@name='firstname']"));
			firstnme.click();
			firstnme.sendKeys(resultxt);
			WebElement cellfetch2=driver.findElement(By.xpath("//*[@id='t02']/tbody/tr[3]/td[2]"));
			String resultxt2=cellfetch2.getText();
			System.out.println(resultxt2);
			WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
			lastname.click();
			lastname.sendKeys(resultxt2);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("window.scrollBy(0 , 300)", "");
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//*[@id="form-textfield"]/textarea
			WebElement txtbox=driver.findElement(By.xpath("//*[@id='form-textfield']/textarea"));
			txtbox.click();
			txtbox.sendKeys("Student");
			
			driver.quit();
		
				
	}
 
}