package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {

public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		Thread.sleep(3000);
		
		//name is given the Second Priority after id
		
		driver.findElement(By.name("FirstName")).sendKeys("Amol");
		
}
	
}
