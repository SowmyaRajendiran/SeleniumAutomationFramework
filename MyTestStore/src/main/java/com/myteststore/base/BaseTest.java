package com.myteststore.base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.myteststore.utilities.ReadPropertyFile;
import com.teststore.enums.ConfigProperties;

public class BaseTest {

	/*
	 * Function Description: This method runs before each test, initialize driver
	 * and launch URL
	 */
	@BeforeTest
	public void setUp() throws Exception {
		DriverFactory.initializeDriver(ReadPropertyFile.getValue(ConfigProperties.getBROWSER()), ReadPropertyFile.getValue(ConfigProperties.getURL()));
	}

	/*
	 * Function Description: This method runs after each test, closes & quits the driver
	 */
	@AfterTest
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}
