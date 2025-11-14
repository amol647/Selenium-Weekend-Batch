package Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("register_Layer")).click();
		
		driver.findElement(By.xpath("//div[@data-val='exp']")).click();
		
		driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("C:\\Users\\Nihal\\Desktop\\Ammie\\Ammie Data Study\\QSpiders\\Advance Selenium Notes\\08102025\\DDT intro (1).pdf");
		
		driver.close();
	}
	
	
}
