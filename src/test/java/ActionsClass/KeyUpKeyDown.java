package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpKeyDown {

	public static void KeyUpDownTest() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		Thread.sleep(3000);

		WebElement FirstName = driver.findElement(By.id("FirstName"));
		WebElement LastName = driver.findElement(By.id("LastName"));
	
		Actions action = new Actions(driver);	
	
		action.sendKeys(FirstName,"AmolShardul").perform();
		
//		action.keyDown(Keys.CONTROL).sendKeys("A").perform();
//		action.keyDown(Keys.CONTROL).sendKeys("C").perform();
//		
////		action.sendKeys(FirstName, Keys.CONTROL+"A").perform();
////		action.sendKeys(FirstName, Keys.CONTROL+"C").perform();
////		
////		action.sendKeys(LastName, Keys.CONTROL+"V").perform();
		
		action.click(FirstName).keyDown(Keys.CONTROL).sendKeys("A").perform();
		action.keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("C").perform();
		action.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		action.click(LastName).keyDown(Keys.CONTROL).sendKeys("V").perform();
		action.keyUp(Keys.CONTROL).perform();
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		KeyUpDownTest();

	}

}
