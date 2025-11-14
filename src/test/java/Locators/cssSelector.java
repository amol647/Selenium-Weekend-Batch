package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	//Faster than Xpath
	
	public static void CSSSelector() throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com");

		Thread.sleep(6000);

		driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("Computer");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		CSSSelector();
	}
	
}
