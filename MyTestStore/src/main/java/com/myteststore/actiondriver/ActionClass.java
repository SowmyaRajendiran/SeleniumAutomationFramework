package com.myteststore.actiondriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.myteststore.base.DriverFactory;

public class ActionClass {

	protected void click(By element) {
		findElement(element).click();
	}
	
	
	protected void enterText(By element, String key) {
		findElement(element).sendKeys(key);
	}
	
	
	protected WebElement findElement(By element) {
		return DriverFactory.getDriver().findElement(element);
	}
}
