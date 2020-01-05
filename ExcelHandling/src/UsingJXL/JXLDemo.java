package UsingJXL;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXLDemo {
	
public static void main(String[] args) {
	String path=System.getProperty("user.dir");
	File file=new File(path+"/Input/TextJXL.xls");
	try {
		Workbook book=Workbook.getWorkbook(file);
		Sheet sheet=book.getSheet("Sheet1");
		System.out.println(sheet.getCell(0,0).getContents());
	} catch (BiffException e) {
		
		System.out.println("Unable to Open Excel File");

		e.printStackTrace();
	} catch (IOException e) {
		System.out.println("we Unable to Open Excel File");
		e.printStackTrace();
	}
	
}

}
