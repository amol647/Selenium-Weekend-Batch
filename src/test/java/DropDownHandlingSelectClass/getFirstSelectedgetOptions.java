package DropDownHandlingSelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedgetOptions {

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
	
		//getFirstSelectedOption
		System.out.println("First Selected Option is: "+select.getFirstSelectedOption().getText());
		
		
		//Printing all the List of Options
		List<WebElement> allOptions = select.getOptions();
		
		for(WebElement option : allOptions)
		{
			System.out.println("All the Values Present in Dropdown:");
			System.out.println(option.getText());
		}
		
		
		//getAllSelectedOptions
		List<WebElement> selectedOption = select.getAllSelectedOptions();
		
		System.out.println("All the Values Present in Dropdown:");
		
		for(WebElement selected : selectedOption)
		{
			System.out.println(selected.getText());
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		MultiListDropDownTest();
	}
}
