package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> allElement = driver.findElements(By.xpath("//table[@class='dataTable']//td[1]"));	
		
		for(WebElement CompanyColumn : allElement)
		{
			System.out.println(CompanyColumn.getText());
		}
	}

}
