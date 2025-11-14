package DropDownHandlingSelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnMultiList {

	public static void MultiListDropDownTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement ColorsMultiListDD = driver.findElement(By.xpath("//select[@id='colors']"));

		Select select = new Select(ColorsMultiListDD);

		System.out.println("Dropdown Type is Multi List Dropdown: "+select.isMultiple()); // TRUE

		select.selectByValue("red");
		Thread.sleep(3000);

		select.selectByValue("green");
		Thread.sleep(3000);

		select.selectByContainsVisibleText("Yellow");
		Thread.sleep(3000);

		select.selectByContainsVisibleText("White");
		Thread.sleep(3000);

		select.selectByIndex(6);
		Thread.sleep(3000);

		select.deselectByValue("green");
		Thread.sleep(3000);

		select.deselectByValue("red");
		Thread.sleep(3000);

//		select.deselectByValue("yellow");
//		Thread.sleep(3000);

		// Get First Selected Option after Deselecting Some
		System.err.println("First Selected Option is: " + select.getFirstSelectedOption().getText());

		Thread.sleep(3000);
		// Print All the Values Present in Dropdown
		List<WebElement> allOptions = select.getOptions();

		System.out.println("All the Values Present in Dropdown:");
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}

		// Get All the Selected Options from Dropdown
		List<WebElement> selectedOption = select.getAllSelectedOptions();

		System.out.println("All the Selected Values From Dropdown:");

		for (WebElement selected : selectedOption) {
			System.out.println(selected.getText());
		}
		
		Thread.sleep(3000);
		
		//Deselect All
		select.deselectAll();

	}

	
	public static void main(String[] args) throws InterruptedException {
		MultiListDropDownTest();
	}
	
}
