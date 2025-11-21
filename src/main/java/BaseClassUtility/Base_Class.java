package BaseClassUtility;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import ObjectRepository.LoginPage;
import ObjectRepository.LogoutPage;
import ObjectRepository.PropertyFileUtility;

public class Base_Class {
	
	public WebDriver driver;
	public PropertyFileUtility putil;

	@BeforeSuite
	public void configBS() {
		Reporter.log("Database connection", true);
	}
	
	@BeforeTest
	public void BTconfig()
	{
		Reporter.log("Precondition if Any", true);
	}
	
	@BeforeClass
	public void BCconfig() throws Exception
	{ 
		ChromeOptions option = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.password_manager_leak_detection", false);
		option.setExperimentalOption("prefs", prefs);

		
		PropertyFileUtility putil = new PropertyFileUtility();
		Reporter.log("Launch Browser", true);
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		String url = putil.readDataFromPropertiesFile("url");
		driver.get(url);
	}
	
	@BeforeMethod
	public void BMconfig() throws Exception
	{
		PropertyFileUtility putil = new PropertyFileUtility();
		Reporter.log("Login", true);
		String username = putil.readDataFromPropertiesFile("username");
		String password = putil.readDataFromPropertiesFile("password");
		LoginPage lp = new LoginPage(driver);
		lp.getUsernametf().sendKeys(username);
		lp.getPasswordtf().sendKeys(password);
		lp.getLoginbutton().click();
	}
	
	@AfterMethod
	public void AMconfig() throws InterruptedException
	{
		Reporter.log("Logout", true);
		LogoutPage lp = new LogoutPage(driver);
		lp.logout();
	}
	
	@AfterClass
	public void ACconfig()
	{
		Reporter.log("Close the browser", true);
		driver.quit();
	}
	
	
	@AfterTest
	public void ATconfig()
	{
		Reporter.log("Post condition", true);
	}
	
	
	@AfterSuite
	public void ASconfig()
	{
		Reporter.log("Database Disconnect", true);
		Reporter.log("Report Backed Up", true);
	}
	
}
