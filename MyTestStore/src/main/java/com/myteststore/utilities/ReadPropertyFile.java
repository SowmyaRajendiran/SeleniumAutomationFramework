package com.myteststore.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;


public final class ReadPropertyFile {

	private static Properties property = new Properties();

	/*
	 * Singleton Design Pattern - Creating Single Instance for the class
	 */
	private ReadPropertyFile() {

	}

	static {
		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources/config/config.properties");
			property.load(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Function Description: This function is used to read the value from
	 * config.properties file
	 * 
	 * @parameter key
	 * 
	 * @return value
	 */
	public static String getValue(String key) throws Exception {

		if (Objects.isNull(key)) {
			throw new Exception("Property value for the" + key + "not found");
		}
		return property.getProperty(key);
	}
}
