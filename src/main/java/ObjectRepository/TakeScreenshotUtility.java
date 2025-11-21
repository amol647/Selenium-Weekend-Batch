package ObjectRepository;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotUtility {

	public void TakeScreenshot() throws Exception
	{
		WebDriver driver=null;
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File Temp = ts.getScreenshotAs(OutputType.FILE);
		
		File Dest = new File("./SS Utility");
		
		FileHandler.copy(Temp, Dest);
		
	}
	
}
