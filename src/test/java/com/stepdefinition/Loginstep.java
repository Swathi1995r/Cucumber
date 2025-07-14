package com.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;

import com.baseclass.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstep extends Baseclass {

	@Given("User is on the login page")
	public void user_is_on_the_login_page() { 
		
	}
	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String username, String password) { 
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@When("User click login button")
	public void user_click_login_button() {    
	}
	@Then("User verify the success message after login \"Welcome Swathir")
	public void user_verify_the_success_message_after_login_welcome_swathir() {  
	}




}
