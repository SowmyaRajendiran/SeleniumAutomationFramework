package com.myteststore.enums;

/*
 * Enums for config properties constants and Methods to convert them to lower case
 */
public enum ConfigProperties {
BROWSER, URL;

public static String getBROWSER() {
	return BROWSER.name().toLowerCase();
}

public static String getURL() {
	return URL.name().toLowerCase();
}
}
