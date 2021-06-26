package ApachePoiTestPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Font;

public class HSSF_Updateexisting {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("E:\\HSSFCreate1.xls");
		HSSFWorkbook wb =new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheet("SheetOne");
		HSSFRow row=sheet.getRow(0);
		
		//Create cell and set value to add formatting
		HSSFCell cell=row.createCell(0);
		//cell.setCellValue(new Date());
		System.out.println(cell.getDateCellValue());
		System.out.println("Changing value");
		
		HSSFCellStyle cellStyle = wb.createCellStyle(); // HSSFCellStyle or CellStyle  
	    Font font = wb.createFont();
	    font.setBold(true);
	    font.setColor((short) 2);
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

	}

}
