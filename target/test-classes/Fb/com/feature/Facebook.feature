 Feature: fb login function with valid details-Testcase Automation
  @fb 
 Scenario Outline: fb login with invalid details
    Given user launch the browser "chrome"
    And user verify that navigate to url "https://www.facebook.com"
    And user verify to land on the facebook page
    And user enter the valid username <username>
    And user enter the valid password <password>
    And user verify to click the login Button
    And user verified the login process successfull
    
  Examples:

  |username|password|
  |"valid username"|"invalid password"|
  |"invalid username"|"valid password"|
  |"invalid username"|"invalid password"|