package Fb.com.stepdefinitions;

import Fb.com.baseclass.Baseclass;
import Fb.com.pageobjectmanager.Pageobjectmanager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Adactin_hotelsteps extends Baseclass {
	Pageobjectmanager obj = new Pageobjectmanager(driver);

	@Given("user open the chrome")
	public void user_open_the_chrome() {
		browserlaunch("chrome");
	}

	@Given("user enter the adactin app url")
	public void user_enter_the_adactin_app_url() {
		getUrl("https://adactinhotelapp.com/");
	}

	@Given("user enter the username")
	public void user_enter_the_username() {
		elementsendkeys(obj.getLogin().getUsername(), "ganesan12");
	}

	@Given("user enter the password")
	public void user_enter_the_password() {
		elementsendkeys(obj.getLogin().getPassword(), "G@nesh8596");
	}

	@Then("user click the adactin app login Button")
	public void user_click_the_adactin_app_login_button() {
		click(obj.getLogin().getLogin_button());
	}

	// page2
	@Given("user click the select location")
	public void user_click_the_select_location() {
		dropdown(obj.getSearch().getLocation(), "index", "5");
	}

	@Given("user click the select hotel")
	public void user_click_the_select_hotel() {
		dropdown(obj.getSearch().getHotels(), "text", "Hotel Hervey");
	}

	@Given("user select the room type")
	public void user_select_the_room_type() {
		dropdown(obj.getSearch().getRoom_type(), "text", "Double");
	}

	@Given("user select the number of rooms")
	public void user_select_the_number_of_rooms() {
		dropdown(obj.getSearch().getNum_of_rooms(), "text", "2 - Two");
	}

	@Then("user set the check in date")
	public void user_set_the_check_in_date() {
		elementsendkeys(obj.getSearch().getCheck_in_date(), "24/03/2022");
	}

	@Then("user set the check out date")
	public void user_set_the_check_out_date() {
		elementsendkeys(obj.getSearch().getCheck_out_date(), "26/03/2022");
	}

	@Then("user select the adults per room")
	public void user_select_the_adults_per_room() {
		dropdown(obj.getSearch().getAdults_per_room(), "text", "2 - Two");
	}

	@Then("user select the childs per room")
	public void user_select_the_childs_per_room() {
		dropdown(obj.getSearch().getChild_per_room(), "text", "2 - Two");
	}

	@Then("user click the search_box Button")
	public void user_click_the_search_box_button() {
		click(obj.getSearch().getSearch_box());
	}

	// page3
	@Then("user select the hotel")
	public void user_select_the_hotel() {
		click(obj.getSelecthotel().getSelecthotel_radio_btn());
	}

	@Then("user enter the search Button")
	public void user_enter_the_search_button() {
		click(obj.getSelecthotel().getContinue_box());
	}

//page4
	@Given("user enter the firstname")
	public void user_enter_the_firstname() {
		elementsendkeys(obj.getBook().getFirstname(), "ganesan");
	}

	@Given("user enter the lastname")
	public void user_enter_the_lastname() {
		elementsendkeys(obj.getBook().getLastname(), "mariappan");
	}

	@Then("user enter the address")
	public void user_enter_the_address() {
		elementsendkeys(obj.getBook().getBilling_address(), "1/3/84,krishnan kovil street,Anna nagar,chennai-78");
	}

	@Then("user the creditcard number")
	public void user_the_creditcard_number() {
		elementsendkeys(obj.getBook().getCredit_card_number(), "1234567890123456");
	}

	@Then("user select the credit card type")
	public void user_select_the_credit_card_type() {
		dropdown(obj.getBook().getCredit_card_type(), "text", "Master Card");
	}

	@Then("user select the credit card expiry month")
	public void user_select_the_credit_card_expiry_month() {
		dropdown(obj.getBook().getExpirydate_month_(), "text", "March");
	}

	@Then("user select the credit card expiry year")
	public void user_select_the_credit_card_expiry_year() {
		dropdown(obj.getBook().getExpirydate_year(), "text", "2022");
	}

	@Then("user enter the credit card cvv number")
	public void user_enter_the_credit_card_cvv_number() {
		elementsendkeys(obj.getBook().getCvv_number(), "123");
	}

	@Then("user click the book now Button")
	public void user_click_the_book_now_button() {
		click(obj.getBook().getBooknow());
	}

	@Then("user finally click the logout Button")
	public void user_finally_click_the_logout_button() {
		click(obj.getBook().getLogout());
	}

	@Then("Adactin hotel reservation booking process completed successfull.")
	public void adactin_hotel_reservation_booking_process_completed_successfull() {
	}

}
