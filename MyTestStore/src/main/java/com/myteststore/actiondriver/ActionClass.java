package com.myteststore.actiondriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.myteststore.base.DriverFactory;
import com.myteststore.enums.ExplicitWaitCondition;

public class ActionClass {

	/*
	 * Function Description: This function is used to Click the Specific Element In
	 * the Web Page
	 * 
	 * @parameter ExplicitWaitCondition
	 * 
	 * @parameter element
	 */
	protected void click(ExplicitWaitCondition condition, By element) {
		findElement(condition, element).click();
	}

	/*
	 * Function Description: This function is used to Enter the text in the Text Box
	 * 
	 * @parameter ExplicitWaitCondition
	 * 
	 * @parameter element
	 * 
	 * @parameter key
	 */
	protected void enterText(ExplicitWaitCondition condition, By element, String key) {
		explicitWait(condition, element).sendKeys(key);
	}

	/*
	 * Function Description: This function is used to Find the Specific Element In
	 * the Web Page
	 * 
	 * @parameter ExplicitWaitCondition
	 * 
	 * @parameter element
	 */
	protected WebElement findElement(ExplicitWaitCondition condition, By element) {
		return explicitWait(condition, element).findElement(element);
	}

	/*
	 * Function Description: This function is used to Find the Specific Element In
	 * the Web Page
	 * 
	 * @parameter ExplicitWaitCondition
	 * 
	 * @parameter element
	 */
	protected WebElement explicitWait(ExplicitWaitCondition condition, By by) {
		WebElement element = null;
		if (condition == ExplicitWaitCondition.VISIBLE) {
			element = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(2))
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		} else if (condition == ExplicitWaitCondition.PRESENCE) {
			element = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(2))
					.until(ExpectedConditions.presenceOfElementLocated(by));
		} else if (condition == ExplicitWaitCondition.CLICKABLE) {
			element = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(2))
					.until(ExpectedConditions.elementToBeClickable(by));
		}

		return element;
	}
}
