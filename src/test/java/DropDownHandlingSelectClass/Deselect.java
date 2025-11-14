package DropDownHandlingSelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void MultiListDropDownTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://omayo.blogspot.com/");
		
		WebElement MultiList = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		
		
		Select select = new Select(MultiList);

		System.out.println(select.isMultiple());
		
		select.selectByContainsVisibleText("Volvo");
		select.selectByValue("swiftx");
		select.selectByValue("Hyundaix");
		
		Thread.sleep(3000);
		
		select.deselectByValue("Hyundaix");
		Thread.sleep(3000);
		
		select.deselectByValue("swiftx");
		Thread.sleep(3000);
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		MultiListDropDownTest();
		
	}
	
	
}
