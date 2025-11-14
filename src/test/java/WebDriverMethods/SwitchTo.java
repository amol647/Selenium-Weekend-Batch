package WebDriverMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void SwitchToWindowAndCloseAllWindow() throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://shoppersstack.com/products_page/3784");

		Thread.sleep(15000);

		driver.findElement(By.id("compare")).click();

		String ParentWindow = driver.getWindowHandle();
		System.out.println("Parent Window" + ParentWindow);

		Set<String> allID = driver.getWindowHandles();
		System.out.println("All Window " + allID);

		allID.remove(ParentWindow);

		for (String id : allID) {
			driver.switchTo().window(id);
			driver.close();
		}

	}

	public static void SwitchToWindowPerformActionAndCloseAllWindow() throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://shoppersstack.com/products_page/3784");

		Thread.sleep(15000);

		driver.findElement(By.id("compare")).click();

		String ParentWindow = driver.getWindowHandle();
		System.out.println("Parent Window" + ParentWindow);

		Set<String> allID = driver.getWindowHandles();
		System.out.println("All Window " + allID);

//		allID.remove(ParentWindow);
		
		List <String> ChildWindows = new ArrayList<>();
		
		for(String window : allID)
		{
			if(!window.equals(ParentWindow))
			{
				ChildWindows.add(window);
			}
		}
		
		//Child 0 Flipkart
		driver.switchTo().window(ChildWindows.get(0));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Mobiles & Tablets']")).click();
			
		//Child 1 Amazon
		driver.switchTo().window(ChildWindows.get(1));
		driver.manage().window().maximize();
		
		//Child 2 EKart
		driver.switchTo().window(ChildWindows.get(2));
		driver.manage().window().maximize();
		
	}

	public static void main(String[] args) throws Throwable {

//		SwitchToWindowAndCloseAllWindow();
		SwitchToWindowPerformActionAndCloseAllWindow();

	}

}
