package AutoSuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionFlipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
//		try
//		{
//			driver.findElement(By.xpath("//span[@role='button")).click();
//		}
//		
//		catch(Exception e)
//		{
//			System.out.println("Login Handled");
//		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Laptop");
		
		List<WebElement> AllList = driver.findElements(By.xpath("//li[@class='AgOexi']"));
		
		for(WebElement suggestion : AllList)
		{
			System.out.println(suggestion.getText());
		}
		
		driver.findElement(By.xpath("//div[text()='laptop hp']")).click();
	}
	
}
