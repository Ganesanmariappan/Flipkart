package Fb.com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Fb\\com\\feature", glue = { "Fb.com.stepdefinitions",
		"Fb.com.hooks" }, tags = "@fb", dryRun = false, stepNotifications = true, plugin = {
				"html:target\\report\\fb.html", "json:target\\report\\fb.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, publish = true)
public class Testrunner {

}
