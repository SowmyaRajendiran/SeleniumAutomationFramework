package com.myteststore.enums;

/*
 * Enums for browser constants and Methods to convert them to lower case
 */
public enum Browser {
	CHROME, FIREFOX, EDGE, IE, SAFARI;

	public static String getCHROME() {
		return CHROME.name().toLowerCase();
	}

	public static String getFIREFOX() {
		return FIREFOX.name().toLowerCase();
	}

	public static String getEDGE() {
		return EDGE.name().toLowerCase();
	}

	public static String getIE() {
		return IE.name().toLowerCase();
	}

	public static String getSAFARI() {
		return SAFARI.name().toLowerCase();
	}
}