package Manipal;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class explicit_wait {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.className("dropdown")).click();


		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		driver.findElement(By.linkText("Gmail")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
		driver.findElement(By.id("identifierId")).sendKeys("karunakara");

		// new version
		WebElement key = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")));
		key.click();

		WebElement key2 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"next\"]/div/div/a")));
		key2.click();

		driver.quit();
		
	}

}
