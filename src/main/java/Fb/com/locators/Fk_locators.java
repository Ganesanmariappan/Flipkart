package Fb.com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Fb.com.baseclass.Baseclass;

public class Fk_locators extends Baseclass {
	public Fk_locators(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='✕']")
	private WebElement login_page_popup;
	@FindBy(xpath = "//div[text()='Mobiles']")
	private WebElement Mobile_tablets;
	@FindBy(xpath = "//div[@class='_1kidPb']//child::span[text()='Electronics']")
	private WebElement Electronics;
	@FindBy(xpath = "//a[text()='Mi']")
	private WebElement Mi;
	@FindBy(xpath = "//h1[text()='Mi Mobiles']")
	private WebElement MI_page;
	@FindBy(xpath = "(//select[@class='_2YxCDZ'])[2]")
	private WebElement Fix_maxiprice;
	@FindBy(name = "q")
	private WebElement search_MIproduct;
	@FindBy(xpath = "//button[@class='L0Z3Pu']")
	private WebElement search_click;
	@FindBy(xpath = "//a[text()='Redmi Note 11 (Horizon Blue, 128 GB)']")
	private WebElement First_product;
	@FindBy(id = "pincodeInputId")
	private WebElement enter_pincode;
	@FindBy(xpath = "//span[text()='View Details']")
	private WebElement click_view;
	@FindBy(xpath = "//button[@class='_2KpZ6l _1KAjNd']")
	private WebElement close_view;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement add_tocart_btn;

	public WebElement getLogin_page_popup() {
		return login_page_popup;
	}

	public WebElement getMobile_tablets() {
		return Mobile_tablets;
	}

	public WebElement getElectronics() {
		return Electronics;
	}
    public WebElement getMi() {
		return Mi;
	}

	public WebElement getMI_page() {
		return MI_page;
	}

	public WebElement getFix_maxiprice() {
		return Fix_maxiprice;
	}

	public WebElement getSearch_MIproduct() {
		return search_MIproduct;
	}

	public WebElement getSearch_click() {
		return search_click;
	}

	public WebElement getFirst_product() {
		return First_product;
	}

	public WebElement getEnter_pincode() {
		return enter_pincode;
	}

	public WebElement getClick_view() {
		return click_view;
	}

	public WebElement getClose_view() {
		return close_view;
	}

	public WebElement getAdd_tocart_btn() {
		return add_tocart_btn;
	}

}
