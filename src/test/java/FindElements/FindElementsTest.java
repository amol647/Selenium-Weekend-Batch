package FindElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsTest {
	
	public static void FindAllLinks() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(4000);
		
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement AllLinksInFlipKart : AllLinks)
		{
			System.out.println(AllLinksInFlipKart.getText());
//			System.out.println(AllLinksInFlipKart.getAttribute("//a"));
		}
		
		
	}
	
	public static void main(String[] args) throws Throwable {
		FindAllLinks();
	}

}
