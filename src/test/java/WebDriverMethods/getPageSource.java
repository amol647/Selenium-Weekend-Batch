package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSource {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		String PageSource = driver.getPageSource();
		
		System.out.println("Source Code of the WebPage: " +PageSource);
}	
}
