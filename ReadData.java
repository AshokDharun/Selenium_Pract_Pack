package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadData 
{
	
	public static String[][] rData(String fileName) throws EncryptedDocumentException, IOException
	{
		Row row;
		Cell cell;
		//File file=new File("./data/Test001.xlsx");///TestNG_POM/data/Test001.xlsx
		FileInputStream fin=new FileInputStream("./data/"+fileName+".xlsx");
		Workbook wb=WorkbookFactory.create(fin);
		Sheet sheet=wb.getSheet("Sheet1");
		int lrow=sheet.getLastRowNum();
		System.out.println("last row: "+lrow);
		int lcell=sheet.getRow(0).getLastCellNum();
		System.out.println("no of cell :" +lcell);
		String[][] data=new String[lrow][lcell];
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
		row=sheet.getRow(i);	
		for(int j=0;j<row.getLastCellNum();j++)
		{
			cell=row.getCell(j);
			cell.setCellType(CellType.STRING);
			
		String val=cell.getStringCellValue();
		
			data[i-1][j]=val;
		}
		}
		return data;
	}
}
