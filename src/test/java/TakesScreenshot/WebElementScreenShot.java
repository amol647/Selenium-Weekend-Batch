package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenShot {
	
	public static void WebElementSSDemoWebShop() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement subscribe = driver.findElement(By.id("newsletter-subscribe-button"));
		File temp = subscribe.getScreenshotAs(OutputType.FILE);
		File dest = new File("./SS04102025/SS.png");
		FileHandler.copy(temp, dest);
	}

	public static void WebElementSSDemoWebShopLogo() throws IOException
	{
		Date d = new Date();
		String datetime = d.toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement Logo = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		File temp = Logo.getScreenshotAs(OutputType.FILE);
		File dest = new File("./SS04102025/SS"+datetime+".png");
		FileHandler.copy(temp, dest);
	}

	
	public static void main(String[] args) throws IOException {

//		WebElementSSDemoWebShop();
		WebElementSSDemoWebShopLogo();
		
	}

}
