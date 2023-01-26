package Fb.com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Fb.com.baseclass.Baseclass;

public class Bookpage extends Baseclass {
	public Bookpage(WebDriver xDriver) {
		this.driver=xDriver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id = "first_name")
	private WebElement firstname;
	@FindBy(id = "last_name")
	private WebElement lastname;
	@FindBy(id = "address")
	private WebElement billing_address;
	@FindBy(id = "cc_num")
	private WebElement credit_card_number;
	@FindBy(id = "cc_type")
	private WebElement credit_card_type;
	@FindBy(name = "cc_exp_month")
	private WebElement  expirydate_month_;
	@FindBy(name = "cc_exp_year")
	private WebElement expirydate_year;
	@FindBy(id = "cc_cvv")
	private WebElement cvv_number;
	@FindBy(id = "book_now")
	private WebElement booknow;
	@FindBy(id = "logout")
	private WebElement logout;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getBilling_address() {
		return billing_address;
	}
	public WebElement getCredit_card_number() {
		return credit_card_number;
	}
	public WebElement getCredit_card_type() {
		return credit_card_type;
	}
	public WebElement getExpirydate_month_() {
		return expirydate_month_;
	}
	public WebElement getExpirydate_year() {
		return expirydate_year;
	}
	public WebElement getCvv_number() {
		return cvv_number;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	public WebElement getLogout() {
		return logout;
	}
	

}
