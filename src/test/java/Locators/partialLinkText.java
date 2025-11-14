package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText {

	public static void partialLinkTxt() throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com");

		Thread.sleep(6000);

		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
	}

	
	public static void partialLinkTxtAssignMent() throws Throwable {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com");

		Thread.sleep(6000);

		driver.findElement(By.linkText("Register")).click();

		driver.findElement(By.id("FirstName")).sendKeys("Amol");
		
		driver.findElement(By.id("LastName")).sendKeys("Shardul");
		
		driver.findElement(By.id("Email")).sendKeys("amol123@gmail.com");
		
		driver.findElement(By.partialLinkText("Shopping cart")).click();
	}

	
	public static void main(String[] args) throws Throwable {

		partialLinkTxtAssignMent();
		
	}

}
