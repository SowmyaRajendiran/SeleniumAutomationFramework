package com.myteststore.pageobjects;

import org.openqa.selenium.By;

import com.myteststore.actiondriver.ActionClass;
import com.myteststore.enums.ExplicitWaitCondition;

public class HomePage extends ActionClass {

	//Locators In Home Page
	private final By buttonSignIn=By.xpath("//a[@class='login']");
	
	/*
	 * Description: Method to click Sign In Button In Home Page
	 */
	public LoginPage clicksignin() {
		click(ExplicitWaitCondition.CLICKABLE , buttonSignIn);
		return new LoginPage();
		
	}
}
