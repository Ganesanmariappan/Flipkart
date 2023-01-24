package Fb.com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Fb\\com\\feature", glue = { "Fb.com.stepdefinitions",
		"Fb.com.hooks" }, tags = "@flipkart", dryRun = false, stepNotifications = true, plugin = {
				"html:target\\report\\flipkart.html", "json:target\\report\\flipkart.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}, publish = true)
public class Fkart_runner {

}
