package com.myteststore.pageobjects;

import org.openqa.selenium.By;

import com.myteststore.actiondriver.ActionClass;
import com.myteststore.enums.ExplicitWaitCondition;

public final class LoginPage extends ActionClass {

	//Locators In LogIn Page
	private final By textboxEmail=By.id("email");
	private final By textboxPassword=By.id("passwd");
	private final By buttonSubmit=By.xpath("//button[@id='SubmitLogin']");
	
	
	/*
	 * Description: Method to click Submit Button In LogIn Page
	 */
	public void signIn() throws InterruptedException {
		enterText(ExplicitWaitCondition.PRESENCE,textboxEmail,"testautomationqa@gmail.com");
		enterText(ExplicitWaitCondition.PRESENCE,textboxPassword,"Test@123");
		Thread.sleep(3000);
		click(ExplicitWaitCondition.CLICKABLE, buttonSubmit);
	}
}
