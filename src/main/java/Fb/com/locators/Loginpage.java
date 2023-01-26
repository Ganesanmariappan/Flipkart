package Fb.com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Fb.com.baseclass.Baseclass;

public class Loginpage extends Baseclass {
public Loginpage(WebDriver xdriver) {
	this.driver=xdriver;
	PageFactory.initElements(driver, this);
}
@FindBy(name = "username")
private WebElement username;
@FindBy(name = "password")
private WebElement password;
@FindBy(name = "login")
private WebElement login_button;
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin_button() {
	return login_button;
}




}
