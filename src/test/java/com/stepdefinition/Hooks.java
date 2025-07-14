package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass {
	WebDriver driver;

	@Before
	public void initial() {
		browserLaunch();
		maximizeWindow();
		appInLaunch("https://adactinhotelapp.com/");
		implicitWait();
	}

	@After
	public void postSetup() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();

	}
}
