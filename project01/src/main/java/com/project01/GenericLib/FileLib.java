package com.project01.GenericLib;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

    public String getPropertyKeyValue (String key) throws Throwable {
 	
     FileInputStream fis= new FileInputStream("./data/commomFile.properties");
 	Properties pObj= new Properties();
 	pObj.load(fis);
 	
 	String value= pObj.getProperty(key);
 	return value;
    }
    
 // fetching data from excel sheet
  	 public String getExcelData(String sheetName, int rowNum, int celNum)throws Throwable {
  		
  		FileInputStream fis=new FileInputStream("./Data/TestData1.xlsx");
  		
  		Workbook wb= WorkbookFactory.create(fis);
  		
  		Sheet sh= wb.getSheet(sheetName);
  		
  		Row row=sh.getRow(rowNum);
  		
  		String data=row.getCell(celNum).getStringCellValue();
  		wb.close();
  		return data;
  	}

}
