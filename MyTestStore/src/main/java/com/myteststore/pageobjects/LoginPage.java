package com.myteststore.pageobjects;

import org.openqa.selenium.By;

import com.myteststore.actiondriver.ActionClass;
import com.myteststore.enums.ExplicitWaitCondition;
import com.myteststore.reports.ExtentManager;
import com.myteststore.reports.ExtentReport;

public final class LoginPage extends ActionClass {

	//Locators In LogIn Page
	private final By textboxEmail=By.id("email");
	private final By textboxPassword=By.id("passwd");
	private final By buttonSubmit=By.xpath("//button[@id='SubmitLogin']");
	
	
	/*
	 * Description: Method to click Submit Button In LogIn Page
	 */
	public void signIn(String email, String password) throws InterruptedException {
		enterText(ExplicitWaitCondition.PRESENCE,textboxEmail, email);
		enterText(ExplicitWaitCondition.PRESENCE,textboxPassword,password);
		Thread.sleep(3000);
		click(ExplicitWaitCondition.CLICKABLE, buttonSubmit);
		ExtentManager.getExtentTest().pass("Clicked Submit Button");
	}
}
