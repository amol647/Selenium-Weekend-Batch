package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void DragAndDropTest()
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://bestvpn.org/html5demos/drag/");
		
		WebElement Dropper = driver.findElement(By.xpath("//div[@id='bin']"));
		
		WebElement Dragger1 = driver.findElement(By.xpath("//a[@id='one']"));
		WebElement Dragger2 = driver.findElement(By.xpath("//a[@id='two']"));
		WebElement Dragger3 = driver.findElement(By.xpath("//a[@id='three']"));
		WebElement Dragger4 = driver.findElement(By.xpath("//a[@id='four']"));
		WebElement Dragger5 = driver.findElement(By.xpath("//a[@id='five']"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(Dragger1, Dropper).perform();
		action.pause(Duration.ofSeconds(3));
		action.dragAndDrop(Dragger2, Dropper).perform();
		action.pause(Duration.ofSeconds(3));
		action.dragAndDrop(Dragger3, Dropper).perform();
		action.pause(Duration.ofSeconds(3));
		action.dragAndDrop(Dragger4, Dropper).perform();
		action.pause(Duration.ofSeconds(3));
		action.dragAndDrop(Dragger5, Dropper).perform();
		
	}
	
	public static void DragAndDropIntXIntYTest()
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction");
		
		WebElement Dragger = driver.findElement(By.id("draggable"));
		
		WebElement Dropper = driver.findElement(By.id("mouse-tracker"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(Dragger, 110, 340).perform();
		
	}
	
	
	public static void main(String[] args) {
		
//		DragAndDropTest();
		DragAndDropIntXIntYTest();
	}

}
