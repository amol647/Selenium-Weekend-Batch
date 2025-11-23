package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClassUtility.Base_Class;
import ObjectRepository.AboutUsPage;
import ObjectRepository.LoginPage;
import ObjectRepository.PropertyFileUtility;
import WebDriverUtility.ExplicitWait;

public class AboutUsTest extends Base_Class {

	
	@Test (groups = {"smoke", "regression"} )
	public void AboutUs() {
		
		AboutUsPage about = new AboutUsPage(driver);
		about.getMenuBtn().click();
		
		ExplicitWait wait = new ExplicitWait();
		wait.Explicitwait(about.getAboutUs());
		
		about.getAboutUs().click();

		String expectedText = "Build apps users love with AI-driven quality";
		WebElement mainTitle = driver.findElement(By.xpath("//h1[text()='Build apps users love with AI-driven quality']"));
		String titleText = mainTitle.getText();
		
		//Verification
//		if(titleText.contains(expectedText)) {
//			System.out.println("About Us Page is Navigated Successfully");
//		} else
//		{
//			System.out.println("We Are Not On Correct Page");
//		}
		
		//Verification
//		SoftAssert soft = new SoftAssert();
//		soft.assertEquals(titleText, expectedText, "Incorrect Page");
		
		
		Assert.assertEquals(titleText, expectedText, "Incorrect Page Assertion Failed");
		
		driver.navigate().back();
//		soft.assertAll();
		
	}
}
