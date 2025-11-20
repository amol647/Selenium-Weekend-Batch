package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClassUtility.Base_Class;

public class AddToCartTc extends Base_Class{
		
	@Test
	public void AddToCart1()
	{
		driver.findElement(By.cssSelector("button[id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.cssSelector("button[id='button[id='add-to-cart-sauce-labs-bike-light']']")).click();
		driver.findElement(By.cssSelector("button[id='button[id='add-to-cart-sauce-labs-bolt-t-shirt']']")).click();
		
		driver.findElement(By.linkText("shopping_cart_link")).click();
	}

}
