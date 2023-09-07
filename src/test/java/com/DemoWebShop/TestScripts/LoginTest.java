package com.DemoWebShop.TestScripts;

import org.testng.annotations.Test;

import com.DemoWebShop.Pages.HomePage;
import com.DemoWebShop.Pages.LandingPage;
import com.DemoWebShop.Pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void LoginPageTest() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickLoginMenu();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterLoginEmail();
		loginPage.enterLoginPassword();
		loginPage.clickLoginBtn();
		
		HomePage homePage = new HomePage(driver);
		homePage.clickLogoutMenu();
	}

}
