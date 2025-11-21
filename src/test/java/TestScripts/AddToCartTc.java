package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClassUtility.Base_Class;
import ObjectRepository.AddToCart;
import ObjectRepository.CheckOutPage;
import ObjectRepository.ExcelFileUtility;
import ObjectRepository.TakeScreenshotUtility;

public class AddToCartTc extends Base_Class{
		
	@Test
	public void AddToCart1() throws Exception
	{
		ExcelFileUtility eutil = new ExcelFileUtility();
		String FirstName = eutil.ReadDataFromExcelFile("Sheet2", 1, 0);
		String LastName = eutil.ReadDataFromExcelFile("Sheet2", 1, 1);
		String PostalCode = eutil.ReadDataFromExcelFile("Sheet2", 1, 2);
		
		AddToCart add = new AddToCart(driver);
		
		//Add Products to cart
		add.getSauceLabBackPack_AddToCart().click();
		add.getSauceLabBikeLight_AddToCart().click();
		add.getSauceLabBoltTShirt_AddToCart().click();
		
		//Click on Cart Button
		add.getShoppingCartLogoButton().click();
		
		CheckOutPage checkout = new CheckOutPage(driver);
		
		//click on checkout button
		checkout.getCheckOutBtn().click();
		
		//Read data for First Name, Last Name, Postal Code from Excel Sheet
		checkout.getFirstName().sendKeys(FirstName);
		checkout.getLastName().sendKeys(LastName);
		checkout.getPostalZipCode().sendKeys(PostalCode);
		
		//Click on Continue button
		checkout.getContinutBtn().click();
		
		//Click on Finish Button
		checkout.getFinishBtn().click();
		
//		TakeScreenshotUtility ts = new TakeScreenshotUtility();
//		ts.TakeScreenshot();
		
		checkout.getBackToHomeBtn().click();
	}

}
