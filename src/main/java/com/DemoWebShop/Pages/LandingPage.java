package com.DemoWebShop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	@FindBy(xpath = "//a[contains(@class, 'login')]")
	private WebElement loginMenu;

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickLoginMenu() {
		loginMenu.click();
	}
}
