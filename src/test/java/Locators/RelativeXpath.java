package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

//	We can directly jump to desired element
	
//	Types
//	1. XPath by Attribute -  //tagname[@AttributeName = 'AttributeValue']
	
//	2. XPath by text function - text()   //tagName[text()='TextValue']
	
//	3. XPath by Multiple Attributes   //tagName[@AN='AV' and @AN='AV']  //tagName[@AN='AV' or @AN='AV']   //tagName[text()='TextValue' and @AN='AV']
	
//	4. XPath by Contains Function - contains()  - Matches the Values Partially
//	   a. XPath by Contains Attribute - //tagName[contains(@AN,'AV')]  --> Can give Partial Attribute Value
//	   b. XPath by Contains text() - //tagName[contains(text(),'TextValue')]

//	5. XPath by Group Index - (Xpath)[index]  --> index starts from 1
	
//	6.
	
//	7.
	
	
	public static void xpathByAttribute() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com");

		Thread.sleep(6000);

		driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("Computer");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("amol123@hotmail.com");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("amol123");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		WebElement LoginFailed = driver.findElement(By.xpath("//span[contains(text(),'Login was')]"));
		WebElement LoginFailed1 = driver.findElement(By.xpath("//li[contains(text(),'No customer')]"));
		
		System.out.println(LoginFailed.getText());
		System.out.println(LoginFailed1.getText());
		
		driver.close();
	}
	
	
	public static void xpathBySurroundings()
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//label[text()='Friday']/..//input[@id='friday']")).click();
		
		driver.findElement(By.xpath("//label[text()='Female']/..//input[@id='female']")).click();
		
	}
	
	
	public static void xpathByAxis()
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		
	}
	
	
	public static void xpathByStartsWith()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[starts-with(@value,'Log in')]")).click();
		
		WebElement validation1 = driver.findElement(By.xpath("//span[starts-with(text(),'Login was unsuccessful')]"));
		System.out.println(validation1.getText());
		
		WebElement validation2 = driver.findElement(By.xpath("//li[starts-with(text(),'No customer')]"));
		System.out.println(validation2.getText());
		
		
	}
	
	
	public static void XpathByMultipleAttributes()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[starts-with(@value,'Log in')]")).click();
		
		driver.findElement(By.xpath("//input[@id='newsletter-email' and @name='NewsletterEmail']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//input[@value='Subscribe' and @id='newsletter-subscribe-button']")).click();
		
		WebElement SignUpMessage = driver.findElement(By.xpath("//div[starts-with(text(),'Thank you for signing up!')]"));
		System.out.println(SignUpMessage.getText());
	}
	
	
	public static void XpathByAxes()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[@value='Search store' and @id='small-searchterms']")).sendKeys("Books");
		
		driver.findElement(By.xpath("//input[@value='Search store']/following-sibling::input")).click();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
//		xpathByAttribute();
//		xpathBySurroundings();
//		xpathByStartsWith();
//		XpathByMultipleAttributes();
		XpathByAxes();
	}
	
}
