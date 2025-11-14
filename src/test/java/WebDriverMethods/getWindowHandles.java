package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {
	
public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/products_page/3784");
		
		Thread.sleep(15000);
		
		driver.findElement(By.id("compare")).click();
		
		String ParentID = driver.getWindowHandle();
		System.out.println("Parent Window " +ParentID);
		
		//Returns Set<String>
		Set<String> allID= driver.getWindowHandles();
		System.out.println("All Window "+allID);
		
}

}
