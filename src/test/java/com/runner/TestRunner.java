package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources",glue = "com.stepdefinition", plugin = {"pretty",
		"html:target/adactin.xml"}, dryRun = false, tags = "@Login1")


public class TestRunner {

}
