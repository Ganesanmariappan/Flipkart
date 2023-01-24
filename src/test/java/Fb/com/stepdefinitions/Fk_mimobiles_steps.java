package Fb.com.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Fb.com.baseclass.Baseclass;
import Fb.com.pageobjectmanager.Pageobjectmanager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Fk_mimobiles_steps extends Baseclass {
	Pageobjectmanager obj = new Pageobjectmanager(driver);

	@Given("user launch that the browser {string}")
	public void user_launch_that_the_browser(String string) {
		browserlaunch(string);
	}

	@Given("user navigate to the url  {string}")
	public void user_navigate_to_the_url(String string) {
		getUrl(string);
	}

	@Given("user close login popup screen")
	public void user_close_login_popup_screen() {
		click(obj.getFk_locators().getLogin_page_popup());

	}

	@Given("user click the mobile option")
	public void user_click_the_mobile_option() {
		click(obj.getFk_locators().getMobile_tablets());
	}

	@Given("user touch the electronics")
	public void user_touch_the_electronics() {
		click(obj.getFk_locators().getElectronics());
	}

	@Given("user click the mi option")
	public void user_click_the_mi_option() {
		click(obj.getFk_locators().getMi());

	}

	@Given("user verify to land on the MI mobile page")
	public void user_verify_to_land_on_the_mi_mobile_page() {
		is_displayed(obj.getFk_locators().getMI_page());
	}

	@Given("user fix the maxi price")
	public void user_fix_the_maxi_price() {
		dropdown(obj.getFk_locators().getFix_maxiprice(), "Value", "20000");
	}

	@Given("user search the MI mobile products")
	public void user_search_the_mi_mobile_products() {
		elementsendkeys(obj.getFk_locators().getSearch_MIproduct(), "Mi");
		
	}

	@Given("user click the first product of mobileoption_page")
	public void user_click_the_first_product_of_mobileoption_page() {
		click(obj.getFk_locators().getFirst_product());
	}

	@Then("product open in new page")
	public void product_open_in_new_page() {
		windowhandles("Mi Redmi Note 11 ( 128 GB Storage, 6 GB RAM ) Online at Best Price On Flipkart.com");
		
	}

	@Then("user check the product value is greater than or equal to zero")
	public void user_check_the_product_value_is_greater_than_or_equal_to_zero() {
	}

	@Then("user enter the pincode")
	public void user_enter_the_pincode() {
		elementsendkeys(obj.getFk_locators().getEnter_pincode(),"627852\n");
	}

	@Then("user click the view details")
	public void user_click_the_view_details() {
		click(obj.getFk_locators().getClick_view());
	}

	@Then("user close the view_details page")
	public void user_close_the_view_details_page() {
		click(obj.getFk_locators().getClose_view());
		
	}

	@Then("user click the Add to cart Button")
	public void user_click_the_add_to_cart_button() {
		click(obj.getFk_locators().getAdd_tocart_btn());

	}

}