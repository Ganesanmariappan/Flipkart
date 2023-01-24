package Fb.com.stepdefinitions;

import Fb.com.baseclass.Baseclass;
import Fb.com.pageobjectmanager.Pageobjectmanager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Adactin_steps extends Baseclass {
	Pageobjectmanager obj = new Pageobjectmanager(driver);

	@Given("user launch through the exact browser {string}")
	public void user_launch_through_the_exact_browser(String string) {
		browserlaunch(string);
	}

	@Given("user navigate to the correct url {string}")
	public void user_navigate_to_the_correct_url(String string) {
		getUrl(string);
	}

	@Given("user verify to land on the Adactin login page")
	public void user_verify_to_land_on_the_adactin_login_page() {
		is_displayed(obj.getAdactin_locator().getAdactin_logo());
	}

	@Then("user enter the username correctly {string}")
	public void user_enter_the_username_correctly(String string) {
		elementsendkeys(obj.getAdactin_locator().getUsername(), string);
	}

	@Then("user enter the password correctly {string}")
	public void user_enter_the_password_correctly(String string) {
		elementsendkeys(obj.getAdactin_locator().getPassword(), string);
	}

	@Then("user click the login Button")
	public void user_click_the_login_button() {
		click(obj.getAdactin_locator().getAdactinlogin_btn());
	}

	@Then("user verified the Adactin login page with valid data process was successfull")
	public void user_verified_the_adactin_login_page_with_valid_data_process_was_successfull() {

	}
}