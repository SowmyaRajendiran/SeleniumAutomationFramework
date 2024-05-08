package com.myteststore.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.myteststore.enums.PathConstants;

public class ReadExcel {
	static FileInputStream fis = null;
	static XSSFWorkbook workbook = null;

	/*
	 * Function Description: Method to read the data from the excel from the
	 * specified sheet name
	 * 
	 * @param sheetName
	 * 
	 * return data
	 */
	public static String[][] getExcelData(String sheetName) {

		workbook = openWorkBook();

		XSSFSheet sheet = workbook.getSheet(sheetName);

		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data[i - 1][j] = value;
			}
		}

		closeWorkBook();
		return data;
	}

	/*
	 * Function Description: Method to open the workbook
	 * 
	 * return workbook
	 */
	public static XSSFWorkbook openWorkBook() {

		try {
			fis = new FileInputStream(PathConstants.getEXCELFILEPATH());
			workbook = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook;
	}

	/*
	 * Function Description: Method to close the workbook
	 * 
	 */
	public static void closeWorkBook() {

		try {
			workbook.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
