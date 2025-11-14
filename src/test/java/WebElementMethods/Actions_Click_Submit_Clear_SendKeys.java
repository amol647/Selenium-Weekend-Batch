package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_Click_Submit_Clear_SendKeys {

	public static void ActionsOnWebElement() throws Throwable
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		WebElement FirstName = driver.findElement(By.id("FirstName"));
		FirstName.sendKeys("Amol");
		FirstName.clear();
		Thread.sleep(3000);
		FirstName.sendKeys("Rahul Soni");
		
		WebElement LastName = driver.findElement(By.id("LastName"));
		LastName.sendKeys("Soni Soni");
		LastName.clear();
		Thread.sleep(3000);
		LastName.sendKeys("Rahul Soni the Warrior..!!");
		
		
		WebElement EMail = driver.findElement(By.id("Email"));
		EMail.sendKeys("Rahul is the Man @gmail.com");
		EMail.clear();
		Thread.sleep(3000);
		EMail.sendKeys("RahulIsTheMan@Gmail.com");
		
		WebElement Password = driver.findElement(By.id("Password"));
		Password.sendKeys("Rahul@123");
		
		
		WebElement ConfPassword = driver.findElement(By.id("ConfirmPassword"));
		ConfPassword.sendKeys("Rahul@123");
		
		driver.findElement(By.id("register-button")).submit();
	}
	
	
	
	public static void main(String[] args) throws Throwable {
		
		ActionsOnWebElement();
	}
	
}
