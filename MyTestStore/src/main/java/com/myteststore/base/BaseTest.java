package com.myteststore.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.myteststore.enums.ConfigProperties;
import com.myteststore.reports.ExtentReport;
import com.myteststore.utilities.ReadPropertyFile;

public class BaseTest {

	/*
	 * Function Description: This method runs before each suite, calls the
	 * initialize extent report method
	 */
	@BeforeSuite
	public void beforeSuite() {
		ExtentReport.initializeReport();
	}

	/*
	 * Function Description: This method runs before each test,calls the initialize
	 * driver and launch URL
	 */
	@BeforeTest
	public void setUp() throws Exception {
		DriverFactory.initializeDriver(ReadPropertyFile.getValue(ConfigProperties.getBROWSER()),
				ReadPropertyFile.getValue(ConfigProperties.getURL()));
	}

	/*
	 * Function Description: This method runs after each test, calls the quit driver
	 * method
	 */
	@AfterTest
	public void tearDown() {
		DriverFactory.quitDriver();
	}

	/*
	 * Function Description: This method runs after each suite, calls the flush
	 * report method
	 */
	@AfterSuite
	public void afterSuite() {
		ExtentReport.flushReport();
	}
}
