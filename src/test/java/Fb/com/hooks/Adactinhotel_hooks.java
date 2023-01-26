package Fb.com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Fb.com.baseclass.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Adactinhotel_hooks extends Baseclass {
	@Before
	private void beforehooks() {
		System.out.println("Am before hooks");
	}

	@After
	private void afterhooks(Scenario scenario) {
		System.out.println("Am after hooks");
		if (scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "img.png", "Adactin_hotelbook screenshot");
		}

	}
}
