package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void ClickAndHoldTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://yonobusiness.sbi/yonobusinesslogin");
		
		WebElement password = driver.findElement(By.id("password"));
		
		WebElement username = driver.findElement(By.id("userName"));
		
		Actions action = new Actions(driver);
		
		action.sendKeys(username, "Amol123").perform();
		
		action.sendKeys(password, "Amol123456").perform();
		
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		
		WebElement EyeButton = driver.findElement(By.xpath("(//img[@class='ng-star-inserted'])[1]"));
		
		action.clickAndHold(EyeButton).perform();
		
		action.pause(Duration.ofSeconds(3));
		
		action.release(EyeButton).perform();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		ClickAndHoldTest();
	}
	
	
}
