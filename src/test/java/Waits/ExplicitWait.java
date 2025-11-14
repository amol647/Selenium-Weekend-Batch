package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	
	public static void ExplicitWaitTest() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://shoppersstack.com/");
		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//a[text()='Men']")).click();
//		
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Electronic']")).click();
		
		driver.findElement(By.xpath("//a[text()='Men']")).click();
		
		driver.findElement(By.xpath("//a[text()='Electronic']")).click();
		
		driver.findElement(By.xpath("//img[@alt='APPLE iPhone 13 Pro max']")).click();
		
		driver.findElement(By.id("Check Delivery")).sendKeys("423101");
		
		WebElement CheckButton = driver.findElement(By.xpath("//button[text()='Check']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(CheckButton));
		
		CheckButton.click();
	
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ExplicitWaitTest();
	}

}
