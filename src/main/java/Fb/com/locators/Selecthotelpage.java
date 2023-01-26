package Fb.com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Fb.com.baseclass.Baseclass;

public class Selecthotelpage extends Baseclass {
	public Selecthotelpage(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "radiobutton_0")
	private WebElement selecthotel_radio_btn;
	@FindBy(id = "continue")
	private WebElement continue_box;
	public WebElement getSelecthotel_radio_btn() {
		return selecthotel_radio_btn;
	}
	public WebElement getContinue_box() {
		return continue_box;
	}
	

}
