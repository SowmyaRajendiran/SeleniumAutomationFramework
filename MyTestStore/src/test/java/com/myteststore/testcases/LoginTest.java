package com.myteststore.testcases;

import org.testng.annotations.Test;

import com.myteststore.base.BaseTest;
import com.myteststore.dataprovider.DataUtils;
import com.myteststore.pageobjects.HomePage;
import com.myteststore.reports.ExtentReport;

public class LoginTest extends BaseTest {

	@Test(dataProvider = "LogIn", dataProviderClass = DataUtils.class)
	public void loginTest(String email, String password) throws InterruptedException {

		ExtentReport.createTest("LogIn  Test");
		new HomePage().clicksignin().signIn(email, password);
	}

}
