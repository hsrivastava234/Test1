package System;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ExportDatainExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		
	//FileOutputStream fi = FileOutputStream("D:\\hsrivastava\\workspace\test");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook();
		 XSSFSheet sheet = workbook.createSheet("JavaBooks");
		 
		 Object[][] bookData =  {{"Head First Java", "Kathy Serria", 11},
				                {"Effective Java", "Joshua Bloch", 12},
	                            {"Clean Code", "Robert martin", 13},
	                            {"Thinking in Java", "Bruce Eckel",14}};
		 
		  for (Object[] aBook : bookData) {
			   
		  int columecount = 0 ;
		 
		  //Row row =sheet.createRow(++columecount );
		  Row row =sheet.createRow(columecount++ );
		   for(Object Field : aBook ){
		
	      org.apache.poi.ss.usermodel.Cell cell = row.createCell(columecount++);
		
	 	 if(Field instanceof String){
			
		 cell.setCellValue((String)Field);
			} 
		else if (Field instanceof Integer){
			cell.setCellValue((Integer) Field);
				
			}
		}
	   }
	

	try (FileOutputStream outputStream = new FileOutputStream("JavaBooks.xlsx")) {
        
		workbook.write(outputStream);
	}

}}
