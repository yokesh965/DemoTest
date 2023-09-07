package com.DemoWebShop.TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.DemoWebShop.Pages.LandingPage;
import com.DemoWebShop.Pages.UtilityLoginPage;

import utilities.ReadExcel;

public class DDF extends BaseTest {

	// Data Driven Framework
	@Test
	public void verifyErrorMsg() throws IOException {

		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickLoginMenu();

		String[][] data = ReadExcel.getData("resources/TestData.xlsx", "Sheet1");

		for (int i = 1; i < 4; i++) {
			String username = data[i][0];
			String password = data[i][1];

			UtilityLoginPage utilityLoginPage = new UtilityLoginPage(driver);
			utilityLoginPage.enterLoginEmail(username);
			utilityLoginPage.enterLoginPassword(password);

			utilityLoginPage.clickLoginBtn();

		}
	}
}
