package com.myteststore.enums;

/*
 * Enums for config properties 
 */
public enum ConfigProperties {
BROWSER, URL, PASSEDSTEPSSCREENSHOT,FAILEDSTEPSSCREENSHOT;

public static String getBROWSER() {
	return BROWSER.name().toLowerCase();
}

public static String getURL() {
	return URL.name().toLowerCase();
}

public static String getPASSEDSTEPSSCREENSHOT() {
	return PASSEDSTEPSSCREENSHOT.name().toLowerCase();
}

public static String getFAILEDSTEPSSCREENSHOT() {
	return FAILEDSTEPSSCREENSHOT.name().toLowerCase();
}
}
