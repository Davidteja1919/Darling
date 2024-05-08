package genericUtilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String readDatafromExcelFile(String sheetname,int rownum,int cellnum) throws Throwable {
		FileInputStream f=new FileInputStream("");
	return WorkbookFactory.create(f).getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	
	}
}
