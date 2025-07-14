package com.baseclass;

import java.time.Duration;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	protected WebDriver driver;
	//Swathi
	
	public void browserLaunch() {
		driver = new ChromeDriver();
	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
		}
	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void appInLaunch(String url) {
		driver.get(url);
	}
}
