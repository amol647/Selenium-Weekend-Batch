package Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyntraTest06092025 {

	public static void AddToCart() throws Throwable {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");

		WebElement SearchTF = driver
				.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		SearchTF.sendKeys("Tshirts Men");
		SearchTF.sendKeys(Keys.ENTER);

		driver.findElement(By.cssSelector("img[title='Moda Rapido Men T-shirt']")).click();

		// driver.switchTo().alert().dismiss();

		Thread.sleep(3000);

		Set<String> AllWindows = driver.getWindowHandles();

		for (String ID : AllWindows) {
			driver.switchTo().window(ID);
		}

		driver.findElement(By.xpath("//p[text()='L']")).click();

		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();

		driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		
		driver.findElement(By.xpath("//div[text()='ENTER PIN CODE']")).click();

		WebElement PIN = driver.findElement(By.xpath("//input[@id='pincode']"));
		
		PIN.sendKeys("423055");
		PIN.sendKeys(Keys.ENTER);
		
		
		
	}

	public static void main(String[] args) throws Throwable {

		AddToCart();

	}

}
