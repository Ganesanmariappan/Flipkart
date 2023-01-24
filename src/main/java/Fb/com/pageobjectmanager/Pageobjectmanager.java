package Fb.com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import Fb.com.baseclass.Baseclass;
import Fb.com.locators.Adactin_locator;
import Fb.com.locators.Fk_locators;
import Fb.com.locators.Locators;

public class Pageobjectmanager extends Baseclass {
	// public static WebDriver driver;
	public Pageobjectmanager(WebDriver driver) {
		this.driver = driver;
	}

	private Locators Locators;

	public Locators getLocators() {
		if (Locators == null) {
			Locators = new Locators(driver);
		}
		return Locators;
	}

	private Fk_locators Fk_locators;

	public Fk_locators getFk_locators() {
		if (Fk_locators == null) {
			Fk_locators = new Fk_locators(driver);

		}
		return Fk_locators;
	}

	private Adactin_locator Adactin_locator;

	public Adactin_locator getAdactin_locator() {
		if (Adactin_locator == null) {
			Adactin_locator = new Adactin_locator(driver);
		}
		return Adactin_locator;
	}
}
