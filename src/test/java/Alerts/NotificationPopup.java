package Alerts;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		
		//Disables Notifications
		options.addArguments("--disable-notifications");

		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.password_manager_leak_detection", false);
		options.setExperimentalOption("prefs", prefs);
		
		//Opens the browser in Incognito Mode
//		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.quikr.com/");
		
		Thread.sleep(3000);
		
		driver.get("http://49.249.28.218:8098/");
		
		WebElement UserName = driver.findElement(By.id("username"));

		WebElement Password = driver.findElement(By.id("inputPassword"));

		WebElement SignInBtn = driver.findElement(By.xpath("//button[text()='Sign In']"));

		//Diesn't disable Notifications
		//Change your password notification
		//Need to use Maps
		UserName.sendKeys("rmgyantra");
		Password.sendKeys("rmgy@9999");
		SignInBtn.click();

		
	}
	
}
