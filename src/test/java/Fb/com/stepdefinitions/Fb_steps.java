package Fb.com.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Fb.com.baseclass.Baseclass;
import Fb.com.pageobjectmanager.Pageobjectmanager;
import io.cucumber.java.en.Given;

public class Fb_steps extends Baseclass {
	//public static WebDriver driver;
	Pageobjectmanager obj = new Pageobjectmanager(driver);
	@Given("user launch the browser {string}")
	public void user_launch_the_browser(String string) {
		browserlaunch(string);
	}
	@Given("user verify that navigate to url {string}")
	public void user_verify_that_navigate_to_url(String string) {
		getUrl(string);
	}
	@Given("user verify to land on the facebook page")
	public void user_verify_to_land_on_the_facebook_page() {
		Assert.assertTrue(is_displayed(obj.getLocators().getFb_logo()));
	}
	@Given("user enter the valid username {string}")
	public void user_enter_the_valid_username(String string) {
		elementsendkeys(obj.getLocators().getUsername(), string);
	}
	@Given("user enter the valid password {string}")
	public void user_enter_the_valid_password(String string) {
		elementsendkeys(obj.getLocators().getPassword(), string);
}
	@Given("user verify to click the login Button")
	public void user_verify_to_click_the_login_button() {
		click(obj.getLocators().getLogin_btn());
		
	}
	@Given("user verified the login process successfull")
	public void user_verified_the_login_process_successfull() {
	   
}}