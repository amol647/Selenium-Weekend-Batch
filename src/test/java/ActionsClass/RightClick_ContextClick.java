package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_ContextClick {

	public static void RightClickTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practice.expandtesting.com/context-menu#google_vignette");
		
		WebElement RightClick = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		
		Actions action = new Actions(driver);
		
		action.contextClick().perform();
		
		Thread.sleep(4000);
		
		action.contextClick(RightClick).perform();
		
		action.release().perform();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		RightClickTest();
	}
	
}
