package Fb.com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Fb.com.baseclass.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Fkart_hooks extends Baseclass {
	@Before
	private void before_hooks() {
		System.out.println("Am before hooks");

	}

	@After
	private void after_hooks(Scenario scenario) {
		System.out.println("Am after hooks");
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshotAs,"image/png","Fkart_screenshot" );
	}

}
