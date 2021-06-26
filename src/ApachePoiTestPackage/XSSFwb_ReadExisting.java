package ApachePoiTestPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class XSSFwb_ReadExisting {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("E:\\DummyXlsx.xlsx");
		XSSFWorkbook wb =XSSFWorkbookFactory.createWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=row.getCell(0);
		if(cell.getCellType()==CellType.STRING) {
			System.out.println(cell.getStringCellValue());
		}
		if(cell.getCellType()==CellType.NUMERIC) {
			System.out.println(cell.getDateCellValue());
			}
		
	}

}
