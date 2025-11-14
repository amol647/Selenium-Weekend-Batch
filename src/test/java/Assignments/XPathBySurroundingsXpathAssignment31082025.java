package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathBySurroundingsXpathAssignment31082025 {
	
	public static void AmazonCheckBox() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement SearchTF = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		SearchTF.sendKeys("Books");
		
		WebElement SearchBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		SearchBtn.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']/../../..//i[@class='a-icon a-icon-checkbox']")).click();
		
	}
	
	public static void main(String[] args) throws Throwable {
		AmazonCheckBox();
	}

}
