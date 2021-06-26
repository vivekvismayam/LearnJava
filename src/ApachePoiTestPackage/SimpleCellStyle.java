package ApachePoiTestPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SimpleCellStyle {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("E:\\\\HSSFCreate1.xls");
			Workbook wb= WorkbookFactory.create(fis);
			Sheet sheet=wb.getSheetAt(0);
			int R1=sheet.getFirstRowNum();
			int R2=sheet.getLastRowNum();
			//System.out.println(R1+" "+R2);
			//Formatting cells
			CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
		    Font font = sheet.getWorkbook().createFont();
		    font.setBold(true);
		    font.setColor((short) 2);
		    font.setFontHeightInPoints((short) 10);
		    font.setItalic(true);
		    cellStyle.setFont(font);
		    
			for(int i=R1;i<=R2;i++) {
				String str="";
				Row row=sheet.getRow(i);
				for(int j=row.getFirstCellNum();j<row.getLastCellNum();j++) {
					Cell cell=row.getCell(j);
					String update=cell.getStringCellValue()+i+j+"_Updated";
					cell.setCellStyle(cellStyle);
					cell.setCellValue(update);
				//	System.out.println(update);
				}
			}	
			
			FileOutputStream fos=new FileOutputStream("E:\\DummyXls.xls");
			wb.write(fos);
			fos.flush();
			System.out.println("Completed");
			
		
		} catch (Exception e) {
			e.printStackTrace();
			} 
	}
}
