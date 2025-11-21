package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClassUtility.Base_Class;
import ObjectRepository.AboutUsPage;
import ObjectRepository.LoginPage;
import ObjectRepository.PropertyFileUtility;
import WebDriverUtility.ExplicitWait;

public class AboutUsTest extends Base_Class {

	
	@Test
	public void AboutUs() {
		
		AboutUsPage about = new AboutUsPage(driver);
		about.getMenuBtn().click();
		
		ExplicitWait wait = new ExplicitWait();
		wait.Explicitwait(about.getAboutUs());
		
		about.getAboutUs().click();

	}
}
