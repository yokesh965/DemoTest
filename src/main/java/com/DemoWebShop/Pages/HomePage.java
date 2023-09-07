package com.DemoWebShop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//a[contains(@class, 'logout')]")
	private WebElement logoutMenu;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickLogoutMenu() {
		logoutMenu.click();
	}
}
