package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		// Excel --------------- Workbook -------------- Sheet ------------- Rows ------------- Cells
		
		//FileInputStream -------- Read the data from excel file
		// XSSFWorkbook ------------- Extract the workbook from the excel
		//XSSFSheet --------------- Extract the sheet from the workbook
		//XSSFRow ----------------- Extract the rows from the sheet
		// XSSFCell -------------- Extract the cell from the rows
		
		
		FileInputStream file = new FileInputStream("/home/yagvendra/Documents/Selenium2/Employee/testdata/testdata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		    XSSFSheet sheet = workbook.getSheet("sheet1");
		    
		      int totalrows   =  sheet.getLastRowNum();
		      
		      int totalcell  =  sheet.getRow(1).getLastCellNum();
		      
		      System.out.println("No of total rows "+totalrows);
		      
		      System.out.println("No of total cells "+totalcell);
		      
		      
		      for(int r=0;r<=totalrows;r++)
		      {
		    	XSSFRow currentrow =   sheet.getRow(r);
		    	  
		    	  for(int c=0;c<totalcell;c++)
		    	  {
		    		 XSSFCell cell =  currentrow.getCell(c);
		    		 System.out.print(cell.toString()+"\t");
		    	  }
		    	  System.out.println();
		      }
		      
		      workbook.close();
		      file.close();
		      
		      
		      
        
	}

}
