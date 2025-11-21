package ObjectRepository;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {

	public String ReadDataFromExcelFile(String sheet, int row, int cell) throws Exception {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/SauceDemoTestData.xls");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		
		wb.close();
		
		return data;
	}

}
