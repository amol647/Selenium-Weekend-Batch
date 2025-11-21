package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPage {

	WebDriver driver;
	
	public AboutUsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="react-burger-menu-btn")
	WebElement MenuBtn;
	
	@FindBy(id="about_sidebar_link")
	WebElement AboutUs;

	public WebElement getMenuBtn() {
		return MenuBtn;
	}

	public WebElement getAboutUs() {
		return AboutUs;
	}
	
}
