package com.DemoWebShop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UtilityLoginPage {

	@FindBy(id = "Email")
	private WebElement emailTextBox;

	@FindBy(id = "Password")
	private WebElement passwordTextBox;

	@FindBy(xpath = "//input[contains(@class, 'login-button')]")
	private WebElement loginBtn;

	public UtilityLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterLoginEmail(String email) {
		emailTextBox.clear();
		emailTextBox.sendKeys(email);
	}

	public void enterLoginPassword(String password) {
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}

}
