package com.myteststore.enums;

/*
 * Enums for config properties 
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
