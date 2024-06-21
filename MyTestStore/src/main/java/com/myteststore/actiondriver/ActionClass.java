package com.myteststore.actiondriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.myteststore.base.DriverFactory;
import com.myteststore.enums.ExplicitWaitCondition;
import com.myteststore.reports.ExtentLogger;

public class ActionClass {

	/*
	 * Function Description: This function is used to Click the Specific Element In
	 * the Web Page
	 * 
	 * @parameter ExplicitWaitCondition
	 * 
	 * @parameter element
	 */
	protected void click(ExplicitWaitCondition condition, By element,String elementName) {
		findElement(condition, element,elementName).click();
		ExtentLogger.pass(elementName+"Has been Clicked Successfully");
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
	protected void enterText(ExplicitWaitCondition condition, By element, String key,String elementName) {
		explicitWait(condition, element).sendKeys(key);
		ExtentLogger.pass(elementName+"Has been Entered Successfully");
	}

	/*
	 * Function Description: This function is used to Find the Specific Element In
	 * the Web Page
	 * 
	 * @parameter ExplicitWaitCondition
	 * 
	 * @parameter element
	 */
	protected WebElement findElement(ExplicitWaitCondition condition, By element, String elementName) {
			ExtentLogger.pass(elementName+"Has been Found Successfully");
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
