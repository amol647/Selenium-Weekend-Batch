package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopup {
	
	public static void AlertPopUp()
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement JSAlertPopUpBtn = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		
		JSAlertPopUpBtn.click();
		
		Alert alert = driver.switchTo().alert();
		
		//Ok --> Accept/Dismiss
		alert.sendKeys("Hello There");
		alert.accept();
		
	}

	
	public static void ConfirmationPopUp()
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement JSConfirmationPopUpBtn = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		
		JSConfirmationPopUpBtn.click();
		
		Alert alert = driver.switchTo().alert();
		
		//Ok Cancel --> Accept or Dismiss
		alert.sendKeys("Hello There");
		alert.accept();
	}
	
	public static void promptPopUp()
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement JSPromptPopUpBtn = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
		JSPromptPopUpBtn.click();
		
		Alert alert = driver.switchTo().alert();
		
		//TextBox --> sendkeys
		//Ok Cancel --> accept or dismiss
		alert.sendKeys("Hello There");
		alert.accept();
	}
	
	
	public static void main(String[] args) {
		
		promptPopUp();
	}
	
	
}
