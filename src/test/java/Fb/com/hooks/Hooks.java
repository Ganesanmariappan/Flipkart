package Fb.com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Fb.com.baseclass.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Baseclass {
	@Before
	public void before_hooks() {
		System.out.println("am before hooks");

	}

	@After
	public void after_hooks(Scenario scenario) {
		System.out.println("am after hooks");
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshotAs, "image/png", "fb_screenshot");
	}
}
