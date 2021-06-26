package ApachePoiTestPackage;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.hwpf.usermodel.DateAndTime;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HSSFWB_createnew {
	public static void main(String[] args) throws Exception {
		
		HSSFWorkbook wb =HSSFWorkbookFactory.createWorkbook();
		HSSFSheet sheet=wb.createSheet("SheetOne");
		HSSFRow row=sheet.createRow(0);
		
		//Create cell and set value to add formatting
		HSSFCell cell=row.createCell(0);
		//cell.setCellValue(new Date());
		cell.setCellValue(new Date(94,05,10,06,07,05));
		
		HSSFCellStyle cellStyle = wb.createCellStyle(); // HSSFCellStyle or CellStyle  
	    Font font = wb.createFont();
	    font.setBold(true);
	    font.setColor((short) 1);
	    font.setFontHeightInPoints((short) 10);
	    font.setItalic(true);
	    cellStyle.setFont(font);
	    
	    HSSFDataFormat formatHSSF= wb.createDataFormat();
	  // DataFormat format=wb.createDataFormat();
	   cellStyle.setDataFormat(formatHSSF.getFormat("dd-mm-yy HH:MM:SS"));
	   cell.setCellStyle(cellStyle);
	   sheet.autoSizeColumn(0);
		
		System.out.println(cell.getCellType());
		System.out.println(cell.getDateCellValue());
		//or directly create and set value
		row.createCell(1).setCellValue(" Date");
		
		FileOutputStream fos=new FileOutputStream("E:\\HSSFCreate1.xls");
		wb.write(fos);
		fos.flush();
		//To read a file create inputstream
	}

}
