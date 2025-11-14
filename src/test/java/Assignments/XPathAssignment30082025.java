package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAssignment30082025 {
	
	public static void WriteXpathForElements() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		
		driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
		
		
//		driver.close();
	}

	public static void main(String[] args) throws Throwable {
		
		WriteXpathForElements();
	}
	
}
