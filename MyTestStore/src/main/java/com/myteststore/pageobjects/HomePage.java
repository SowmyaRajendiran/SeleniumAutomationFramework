package com.myteststore.pageobjects;

import org.openqa.selenium.By;

import com.myteststore.actiondriver.ActionClass;
import com.myteststore.enums.ExplicitWaitCondition;
import com.myteststore.reports.ExtentManager;
import com.myteststore.reports.ExtentReport;

public class HomePage extends ActionClass {

	//Locators In Home Page
	private final By buttonSignIn=By.xpath("//a[@class='login']");
	
	/*
	 * Description: Method to click Sign In Button In Home Page
	 */
	public LoginPage clicksignin() {
		click(ExplicitWaitCondition.CLICKABLE , buttonSignIn);
		ExtentManager.getExtentTest().pass("Clicked Login Button");
		return new LoginPage();
		
	}
}
