package Fb.com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Fb\\com\\feature",glue = "Fb.com.stepdefinitions",tags="@adactin",
dryRun = false,
stepNotifications = true,plugin = {"html:target\\report\\Adactin.html","json:target\\report\\Adactin.json"},publish = true)
public class Adactin_runner {

}
