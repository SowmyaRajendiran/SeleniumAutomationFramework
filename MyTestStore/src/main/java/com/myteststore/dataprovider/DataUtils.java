package com.myteststore.dataprovider;

import org.testng.annotations.DataProvider;
import com.myteststore.utilities.ReadExcel;

public class DataUtils {

	@DataProvider(name = "LogIn")
	public String[][] getData() {
		String[][] excelData = ReadExcel.getExcelData("LogIn");
		return excelData;

	}

}
