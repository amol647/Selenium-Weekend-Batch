package ActionsClass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassAssignmentMyntraTest20092025 {

	public static void MoveToAndClick()
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.myntra.com/");
		
		WebElement Home = driver.findElement(By.xpath("//a[@data-group='home']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(Home).perform();
		
		WebElement Mirror = driver.findElement(By.xpath("//a[text()='Mirrors']"));
		
		action.moveToElement(Mirror).click().perform();
		
		WebElement MirrorToAdd = driver.findElement(By.xpath("//img[contains(@title,'Sasimo Egypt White Rectangle')]"));
		
		action.moveToElement(MirrorToAdd).click().perform();
		
		String Parent = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		allWindows.remove(Parent);
		
		for(String Child : allWindows)
		{
			driver.switchTo().window(Child);
		}
		
		WebElement AddToBag = driver.findElement(By.xpath("//div[text()='ADD TO BAG']"));
		
		action.click(AddToBag).perform();
		
		
	}
	

	
	public static void main(String[] args) {
		
		MoveToAndClick();
		
	}
	
	
}
