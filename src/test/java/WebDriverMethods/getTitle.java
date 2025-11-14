package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		
		String Title = driver.getTitle();
		
		System.out.println("Title of the WebPage: " +Title);
				
	}
	
}
