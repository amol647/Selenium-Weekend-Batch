package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Auto Healing
	@FindAll ({@FindBy(id="user-name"),@FindBy(name="user-name")})
	private WebElement usernametf;
	
	
	@FindBy(id="password")
	WebElement passwordtf;
	

	@FindBy(id="login-button")
	WebElement loginbutton;

	
	public WebElement getUsernametf() {
		return usernametf;
	}


	public WebElement getPasswordtf() {
		return passwordtf;
	}


	public WebElement getLoginbutton() {
		return loginbutton;
	}
	

}
