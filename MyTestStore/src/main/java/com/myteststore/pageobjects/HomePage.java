package com.myteststore.pageobjects;

import org.openqa.selenium.By;

import com.myteststore.actiondriver.ActionClass;

public class HomePage extends ActionClass {

	private final By buttonSignIn=By.xpath("//a[@class='login']");
	
	public LoginPage clicksignin() {
		click(buttonSignIn);
		return new LoginPage();
		
	}
}
