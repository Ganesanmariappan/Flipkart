Feature: Adactin login_page with valid details-Testcase automation
@adactin
Scenario: Adactin login page with valid input data.

Given user launch through the exact browser "chrome"
And   user navigate to the correct url "https://adactinhotelapp.com/" 
And   user verify to land on the Adactin login page 
Then  user enter the username correctly "Ajithkumar"
Then  user enter the password correctly "Human2god"
And   user click the login Button
And   user verified the Adactin login page with valid data process was successfull
