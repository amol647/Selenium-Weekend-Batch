package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText {

public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		
		Thread.sleep(6000);
		
		driver.findElement(By.linkText("Register")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.id("FirstName")).sendKeys("Amol");
		
}
	
	
}
