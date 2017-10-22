package excelOperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Operation {

	public static void main(String[] args) throws Exception {
	
	File src=new File("/Users/rajeshkumar/Desktop/Testdata.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheetAt(0);
	int rownum=sheet1.getLastRowNum();
	for(int i=0;i<=rownum;i++)
	{
		for(int j=0;j<=rownum;j++)
		{
			String val=sheet1.getRow(i).getCell(j).getStringCellValue();
			System.out.println(val);
		}
	}
	}

}
