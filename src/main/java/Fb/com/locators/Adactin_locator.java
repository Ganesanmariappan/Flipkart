package Fb.com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Fb.com.baseclass.Baseclass;

public class Adactin_locator extends Baseclass {
	public Adactin_locator(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = " img[class='logo']")
	private WebElement adactin_logo;
	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login")
	private WebElement adactinlogin_btn;

	public WebElement getAdactin_logo() {
		return adactin_logo;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getAdactinlogin_btn() {
		return adactinlogin_btn;
	}

}
