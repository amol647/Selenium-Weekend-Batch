package DropDownHandlingSelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingFromDropdown {

	public static void DropDownHandlingTest()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select DaySelect = new Select(Day);
		DaySelect.selectByIndex(10);
		
		
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select MonthSelect = new Select(Month);
		MonthSelect.selectByValue("11");
		
		
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		Select YearSelect = new Select(Year);
		YearSelect.selectByVisibleText("2021");
		
		//Cannot use deselect on Single List Dropdown ==> Gives UnsupportedOperationException
//		YearSelect.deselectByVisibleText("2021");
		
		
	}
	
	
	public static void main(String[] args) {
		
		DropDownHandlingTest();
		
	}
	
}
