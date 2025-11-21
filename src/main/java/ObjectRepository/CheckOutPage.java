package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

	WebDriver driver;
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="checkout")
	WebElement CheckOutBtn;
	
	@FindBy(id="first-name")
	WebElement FirstName;
	
	@FindBy(id="last-name")
	WebElement LastName;
	
	@FindBy(id="postal-code")
	WebElement PostalZipCode;
	
	@FindBy(id="continue")
	WebElement ContinutBtn;
	
	@FindBy(id="finish")
	WebElement FinishBtn;
	
	@FindBy(id="back-to-products")
	WebElement BackToHomeBtn;

	public WebElement getBackToHomeBtn() {
		return BackToHomeBtn;
	}

	public WebElement getContinutBtn() {
		return ContinutBtn;
	}

	public WebElement getFinishBtn() {
		return FinishBtn;
	}

	public WebElement getCheckOutBtn() {
		return CheckOutBtn;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getPostalZipCode() {
		return PostalZipCode;
	}
	
	
}
