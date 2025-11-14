package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void DoubleClickTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://omayo.blogspot.com/");
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
		
		Actions action = new Actions(driver);
		
		action.scrollToElement(doubleclick);
		
		action.doubleClick(doubleclick).perform();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		DoubleClickTest();
	}
	
	
	
}
