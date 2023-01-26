package Fb.com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import Fb.com.baseclass.Baseclass;
import Fb.com.locators.Adactin_locator;
import Fb.com.locators.Bookpage;
import Fb.com.locators.Fk_locators;
import Fb.com.locators.Locators;
import Fb.com.locators.Loginpage;
import Fb.com.locators.Searchpage;
import Fb.com.locators.Selecthotelpage;

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

	private Loginpage login;
	private Searchpage search;
	private Selecthotelpage selecthotel;
	private Bookpage book;

	public Loginpage getLogin() {
		if (login == null) {
			login = new Loginpage(driver);

		}
		return login;
	}

	public Searchpage getSearch() {
		if (search == null) {
			search = new Searchpage(driver);

		}
		return search;
	}

	public Selecthotelpage getSelecthotel() {
		if (selecthotel == null) {
			selecthotel = new Selecthotelpage(driver);

		}
		return selecthotel;
	}

	public Bookpage getBook() {
		if (book == null) {
			book = new Bookpage(driver);

		}
		return book;
	}

}
