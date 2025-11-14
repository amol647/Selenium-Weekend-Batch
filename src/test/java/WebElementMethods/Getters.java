package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getters {

	public static void GettersOnWebElement() throws Throwable
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	
		WebElement Subscribe = driver.findElement(By.id("newsletter-subscribe-button"));
		
		System.out.println(Subscribe.getText());
		
		
		System.out.println(Subscribe.getAttribute("type"));
		System.out.println(Subscribe.getAttribute("value"));
		System.out.println(Subscribe.getAttribute("id"));
		System.out.println(Subscribe.getAttribute("class"));
		
		System.out.println(Subscribe.getCssValue("font"));
		System.out.println(Subscribe.getCssValue("background"));
		System.out.println(Subscribe.getCssValue("border"));
		System.out.println(Subscribe.getCssValue("color"));
		System.out.println(Subscribe.getCssValue("text-shadow"));
		
		
		System.out.println(Subscribe.getTagName());
		
		
		System.out.println("Dimensions of Subscribe Button:" +Subscribe.getSize());
		
		Dimension dimensions = Subscribe.getSize();
		
		int Height = dimensions.getHeight();
		System.out.println("Height Of Subscribe Button:"+Height);
		
		int Width = dimensions.getWidth();
		System.out.println("Width Of Subscribe Button:"+Width);
	}
	
	
	public static void main(String[] args) throws Throwable {
		GettersOnWebElement();
	}
}
