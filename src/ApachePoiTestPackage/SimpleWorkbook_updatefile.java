package ApachePoiTestPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class SimpleWorkbook_updatefile {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("E:\\DummyXls.xls");
			Workbook wb= WorkbookFactory.create(fis);
			Sheet sheet=wb.getSheetAt(0);
			int R1=sheet.getFirstRowNum();
			int R2=sheet.getLastRowNum();
			//System.out.println(R1+" "+R2);
			for(int i=R1;i<=R2;i++) {
				String str="";
				Row row=sheet.getRow(i);
				for(int j=row.getFirstCellNum();j<row.getLastCellNum();j++) {
					Cell cell=row.getCell(j);
					str=str+cell.getStringCellValue()+" ";
					String update="Updated"+i+" "+j;
					cell.setCellValue(update);
					System.out.println(update);
				}
				System.out.println(str);
			}	
			
			FileOutputStream fos=new FileOutputStream("E:\\DummyXls.xls");
			wb.write(fos);
			fos.flush();
		} catch (Exception e) {
			
			e.printStackTrace();
			} 
	}

}
