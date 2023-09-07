package com.DemoWebShop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "Email")
	private WebElement emailTextBox;

	@FindBy(id = "Password")
	private WebElement passwordTextBox;

	@FindBy(xpath = "//input[contains(@class, 'login-button')]")
	private WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterLoginEmail() {
		emailTextBox.sendKeys("ltest@test.com");
	}

	public void enterLoginPassword() {
		passwordTextBox.sendKeys("ltest@test");
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}
}
