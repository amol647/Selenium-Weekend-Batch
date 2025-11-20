package ObjectRepository;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {

	public String readDataFromPropertiesFile(String test) throws Exception {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/PropertyFile.txt");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop.getProperty(test);
		
	}
	
}
