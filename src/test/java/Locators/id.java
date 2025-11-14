package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {

public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		//id is the Fastest Locator
		//id is given the First Priority

		driver.findElement(By.id("FirstName")).sendKeys("Amol");
		
}
	
}
