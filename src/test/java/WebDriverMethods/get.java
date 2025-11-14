package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class get {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
//		RemoteWebDriver driver = new ChromeDriver();
		
//		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		Opens the new URL in the same tab
//		driver.get("https://www.amazon.in/");
		
	}

}
