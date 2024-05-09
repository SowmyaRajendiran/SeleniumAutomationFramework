package com.myteststore.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {

	/*
	 * Singleton Design Pattern - Creating Single Instance for the class
	 */

	private ExtentManager() {
	}

	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

	public static ExtentTest getExtentTest() {
		return extentTest.get();

	}

	public static void setExtentTest(ExtentTest test) {
		extentTest.set(test);
	}

	public static void unload() {
		extentTest.remove();
	}
}
