package Fb.com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Fb.com.baseclass.Baseclass;

public class Locators extends Baseclass {
	// public static WebDriver driver;

	public Locators(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "img[alt='Facebook']")
	private WebElement fb_logo;
	@FindBy(id = "email")
	private WebElement username;
	@FindBy(id = "pass")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement login_btn;

	public WebElement getFb_logo() {
		return fb_logo;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

}
