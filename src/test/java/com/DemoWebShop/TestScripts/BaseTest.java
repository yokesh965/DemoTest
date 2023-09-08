package com.DemoWebShop.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;

	@BeforeTest
	public void LaunchApplication() {		
		// 1. Open the browser
		driver = new EdgeDriver();

		// 2. Maximize it
		driver.manage().window().maximize();

		// 3. Navigate to https://demowebshop.tricentis.com
		driver.get("https://demowebshop.tricentis.com/");
	}

	// Close the browser
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}

}
