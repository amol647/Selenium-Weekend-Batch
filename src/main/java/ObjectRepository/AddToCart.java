package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

WebDriver driver;
	
	public AddToCart(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement SauceLabBackPack_AddToCart;
	
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement SauceLabBikeLight_AddToCart;
	
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	WebElement SauceLabBoltTShirt_AddToCart;
	
	
	@FindBy(xpath = "//div[@id='shopping_cart_container']")
	WebElement ShoppingCartLogoButton;

	public WebElement getSauceLabBackPack_AddToCart() {
		return SauceLabBackPack_AddToCart;
	}


	public WebElement getSauceLabBikeLight_AddToCart() {
		return SauceLabBikeLight_AddToCart;
	}


	public WebElement getSauceLabBoltTShirt_AddToCart() {
		return SauceLabBoltTShirt_AddToCart;
	}


	public WebElement getShoppingCartLogoButton() {
		return ShoppingCartLogoButton;
	}
	
	
}
