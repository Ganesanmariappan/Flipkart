
Feature: Adactin Hotel reservation booking process
@reg
Scenario: Adactin app login
Given user open the chrome
And user enter the adactin app url
And user enter the username
And user enter the password
Then user click the adactin app login Button 
@reg
Scenario: Hotel search in adactin
Given user click the select location
And user click the select hotel
And user select the room type
And user select the number of rooms
Then user set the check in date
And user set the check out date
And user select the adults per room
Then user select the childs per room
Then user click the search_box Button
@reg
Scenario: Confirmation hotel booking
Then user select the hotel 
And user enter the search Button
@reg
Scenario: Enter the user details
And user enter the firstname
And user enter the lastname
Then user enter the address
And user the creditcard number
And user select the credit card type
Then user select the credit card expiry month
And user select the credit card expiry year
Then user enter the credit card cvv number
Then user click the book now Button
Then user finally click the logout Button
Then Adactin hotel reservation booking process completed successfull.  