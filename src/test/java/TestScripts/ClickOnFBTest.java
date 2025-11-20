package TestScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClassUtility.Base_Class;
import WebDriverUtility.ExplicitWait;

public class ClickOnFBTest extends Base_Class {
	
	@Test
	public void FacebookTest() throws InterruptedException
	{
		Thread.sleep(10000);
		
		WebElement FBLogo = driver.findElement(By.linkText("Facebook"));
		FBLogo.click();
		
		
		String parentID = driver.getWindowHandle();
		
		Set<String> allIDs = driver.getWindowHandles();
		
		allIDs.remove(parentID);
		
		for(String id : allIDs)
		{
			driver.switchTo().window(id);
			driver.findElement(By.name("email")).sendKeys("Anjali");
		}
		
		driver.switchTo().window(parentID);
		
		driver.navigate().to("https://www.saucedemo.com/inventory.html");
		
	}
	

}
