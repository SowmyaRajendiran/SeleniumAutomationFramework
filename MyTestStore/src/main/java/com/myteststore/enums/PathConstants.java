package com.myteststore.enums;

/*
 * Enum for framework constants
 */
public enum PathConstants {
	USERDIRECTORY, PROPERTYFILEPATH;

	public static String getUSERDIRECTORY() {
		return System.getProperty("user.dir");
	}

	public static String getPROPERTYFILEPATH() {
		return getUSERDIRECTORY() + "/src/test/resources/config/config.properties";
	}
}