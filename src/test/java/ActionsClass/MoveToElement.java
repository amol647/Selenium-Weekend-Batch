package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveToElement {

	public static void MoveToElementTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/");

		WebElement Computer = driver.findElement(By.partialLinkText("COMPUTER"));
		
		WebElement Notebook = driver.findElement(By.xpath("(//a[contains(text(),'Notebooks')])[1]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(Computer).perform();
		
		Thread.sleep(3000);
		
		action.moveToElement(Notebook).click().perform();
	}
	
	
	public static void MoveToElementFlipkartTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");

		
		
		WebElement Electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(null))
		
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(Electronics).perform();
		
		WebElement CameraAndAccessories = driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
		
		action.moveToElement(CameraAndAccessories).perform();
		
		WebElement InstantCameras = driver.findElement(By.xpath("//a[text()='Instant Cameras']"));
		
		action.moveToElement(InstantCameras).click().perform();
		
		WebElement  FujiFilm = driver.findElement(By.xpath("//div[text()='FUJIFILM Instax Mini 41 Instant Camera']"));
		
		action.moveToElement(FujiFilm).click().perform();
		
//		Doesn't Find the Element
//		action.click(FujiFilm);  
	
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
//		MoveToElementTest();
		
		MoveToElementFlipkartTest();
	}
	
}
