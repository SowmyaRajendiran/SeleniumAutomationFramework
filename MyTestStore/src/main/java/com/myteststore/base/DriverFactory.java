package com.myteststore.base;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.myteststore.enums.Browser;

public class DriverFactory {

	/*
	 * Singleton Design Pattern - Creating Single Instance for the class
	 */
	private DriverFactory() {

	}
	
	private static ThreadLocal<WebDriver> localdriver = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return localdriver.get();

	}

	public static void setDriver(WebDriver driverRef) {
		localdriver.set(driverRef);
	}

	public static void unload() {
		localdriver.remove();
	}

	/*
	 * Function Description: This function is used to initialize the driver based on
	 * the browser selection
	 * 
	 * @parameter browser
	 * 
	 * @parameter URL
	 */
	public static void initializeDriver(String browser, String URL) {
		if (Objects.isNull(getDriver())) {

			if (browser.equals(Browser.getCHROME())) {
				setDriver(new ChromeDriver());
			} else if (browser.equals(Browser.getFIREFOX())) {
				setDriver(new FirefoxDriver());
			} else if (browser.equals(Browser.getEDGE())) {
				setDriver(new EdgeDriver());
			} else if (browser.equals(Browser.getIE())) {
				setDriver(new InternetExplorerDriver());
			}
		}
		getDriver().get(URL);
	}

	/*
	 * Function Description: This function is used to Close the driver and remove
	 * the local driver instance
	 */
	public static void quitDriver() {
		if (Objects.nonNull(getDriver())) {
			getDriver().quit();
			unload();
		}
	}
}
