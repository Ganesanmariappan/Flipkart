package Fb.com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Fb.com.baseclass.Baseclass;

public class Searchpage extends Baseclass{
	public Searchpage(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name = "location")
	private WebElement location;
	@FindBy(name = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement room_type;
	@FindBy(id = "room_nos")
	private WebElement num_of_rooms;
	@FindBy(id = "datepick_in")
	private WebElement check_in_date;
	@FindBy(id = "datepick_out")
	private WebElement check_out_date;
	@FindBy(id = "adult_room")
	private WebElement adults_per_room;
	@FindBy(name = "child_room")
	private WebElement child_per_room;
	@FindBy(id = "Submit")
	private WebElement search_box;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getNum_of_rooms() {
		return num_of_rooms;
	}
	public WebElement getCheck_in_date() {
		return check_in_date;
	}
	public WebElement getCheck_out_date() {
		return check_out_date;
	}
	public WebElement getAdults_per_room() {
		return adults_per_room;
	}
	public WebElement getChild_per_room() {
		return child_per_room;
	}
	public WebElement getSearch_box() {
		return search_box;
	}
	

}
