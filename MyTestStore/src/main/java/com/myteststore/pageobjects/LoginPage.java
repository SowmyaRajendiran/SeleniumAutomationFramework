package com.myteststore.pageobjects;

import org.openqa.selenium.By;

import com.myteststore.actiondriver.ActionClass;

public final class LoginPage extends ActionClass {

	private final By textboxEmail=By.id("email");
	private final By textboxPassword=By.id("passwd");
	private final By buttonSubmit=By.id("SubmitLogin");
	
	public void signIn() throws InterruptedException {
		enterText(textboxEmail,"testautomationqa@gmail.com");
		enterText(textboxPassword,"Test@123");
		Thread.sleep(3000);
		click(buttonSubmit);
	}
}
