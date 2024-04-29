package com.myteststore.testcases;

import org.testng.annotations.Test;

import com.myteststore.base.BaseTest;
import com.myteststore.pageobjects.HomePage;

public class LoginTest extends BaseTest {

	@Test
	public void testcase1() throws InterruptedException {
		new HomePage().clicksignin().signIn();
	}
}
