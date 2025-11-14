package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdgeBrowserTest {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new EdgeDriver();
		
		driver.get("https://example.com");
		
	}
	
}
