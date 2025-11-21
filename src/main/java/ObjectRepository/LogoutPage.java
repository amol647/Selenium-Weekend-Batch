package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	WebDriver driver;
	
	public LogoutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="react-burger-menu-btn")
	WebElement logoutPopup;
	

	@FindBy(id="logout_sidebar_link")
	WebElement logoutbutton;
	
	public void logout()
	{
		logoutPopup.click();
		logoutbutton.click();
	}
	
}
