package AutoSuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionAmazon {

	public static void AmazonAutoSuggTest()
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");
		
		WebElement SearchTF = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		SearchTF.sendKeys("TShirts");
		
		List<WebElement> AllSugg = driver.findElements(By.xpath("//div[contains(@id,'sac-suggestion-row')]"));
		
		for(WebElement Sugg : AllSugg)
		{
			System.out.println(Sugg.getText());
		}
		
	}
	
	
	public static void main(String[] args) {
		AmazonAutoSuggTest();
	}
	
	
}
