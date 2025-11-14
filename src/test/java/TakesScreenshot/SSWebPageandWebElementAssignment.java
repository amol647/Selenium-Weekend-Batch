package TakesScreenshot;

import java.io.File;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class SSWebPageandWebElementAssignment {
	

	public static void WebElementSSSauceDemo() throws Throwable
	{
		Date d = new Date();
		String datetime = d.toString().replace(":", "-");
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.saucedemo.com/");
		
		WebElement UserName = driver.findElement(By.id("user-name"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		UserName.sendKeys("standard_user");
		Password.sendKeys("secret_sauce");
		LoginButton.click();
		
		WebElement SortDD = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		
		Thread.sleep(2000);
		Select select = new Select(SortDD);
		select.selectByVisibleText("Name (Z to A)");
		
		Thread.sleep(2000);
		
		WebElement Product = driver.findElement(By.xpath("//img[@alt='Sauce Labs Onesie']"));
		Product.click();
		
		WebElement addtocart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		addtocart.click();
		
		WebElement cartlogo = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
		cartlogo.click();
		
		WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		checkout.click();
		
		driver.findElement(By.id("first-name")).sendKeys("Amol");
		driver.findElement(By.id("last-name")).sendKeys("Shardul");
		driver.findElement(By.id("postal-code")).sendKeys("411028");
		
		driver.findElement(By.id("continue")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./SS04102025/SS1"+datetime+".png");
		FileHandler.copy(temp1, dest1);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("finish")).click();
		
		WebElement Thanks = driver.findElement(By.xpath("//div[@id='checkout_complete_container']"));
		
		File temp2 = Thanks.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./SS04102025/SS"+datetime+".png");
		FileHandler.copy(temp2, dest2);
		
		Thread.sleep(2000);
	}
	
	
	public static void main(String[] args) throws Throwable {
		WebElementSSSauceDemo();
	}

}
