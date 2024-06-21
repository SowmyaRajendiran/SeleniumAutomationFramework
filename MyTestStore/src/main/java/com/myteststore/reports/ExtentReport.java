package com.myteststore.reports;

import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.myteststore.enums.PathConstants;

public final class ExtentReport {

	private ExtentReport() {
	}

	private static ExtentReports extent;

	/*
	 * Function Description: This method is used to initialize the extent report
	 */
	public static void initializeReport() {
		if (Objects.isNull(extent)) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("Automation Report");
		}
	}

	/*
	 * Function Description: This method is used to initialize the extent test
	 */
	public static void createTest(String testCaseName) {
		ExtentTest test = extent.createTest(testCaseName);
		ExtentManager.setExtentTest(test);
	}

	/*
	 * Function Description: This method is used to flush the extent report
	 */
	public static void flushReport() {
		if (Objects.nonNull(extent)) {
			extent.flush();

		}
	}

}
