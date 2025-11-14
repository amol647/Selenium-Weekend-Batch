package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

//		manage()  ==> Return Tyoe = Options
//		Manages  ==>  1. window	==> Return Type = window	
//					2. timeouts
//					3. cookies
		
		driver.get("https://www.facebook.com/");

		// opens the new URL in same Tab
		driver.get("https://www.amazon.in/");

		//1. window methods
//		1. maximize()	2. minimize()	3. fullscreen()		4. getSize()	5.setSize()
//		6. getPosition()	7. setPosition()
		// Maximize the Window
		driver.manage().window().maximize();

		// Minimize the Window
		driver.manage().window().minimize();

		driver.manage().window().maximize();

		// To Capture x & y Coordinates of the Browser Window
		// getPosition ==> ReturnType = Point (class in selenium)
		Point point = driver.manage().window().getPosition();
		System.out.println(point);
		// To Print x & y Coordinates of the Browser Window seperately
		// getX ==> Returns int
		// getY ==> Returns int
		System.out.println(point.getX());
		System.out.println(point.getY());

		
		// To Capture Height & Width of the Browser Window
		// getSize ==> Return Type = Dimension
		Dimension d = driver.manage().window().getSize();
		System.out.println(d);

		
		// To Print Height & Width Coordinates of the Browser Window seperately
		// getHeight ==> Returns int
		// getWidth ==> Returns int
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());

		//For FullScreen Mode
		driver.manage().window().fullscreen();
		
	}

}
