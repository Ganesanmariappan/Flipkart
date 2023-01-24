
Feature: Order Mi mobile -Testcase Automation
@flipkart
Scenario: Mobile order with valid details
Given user launch that the browser "Chrome"
And user navigate to the url  "https://www.flipkart.com"
And user close login popup screen
And user click the mobile option
And user touch the electronics
And user click the mi option
And user verify to land on the MI mobile page
And user fix the maxi price
And user search the MI mobile products
And user click the first product of mobileoption_page
Then product open in new page
And user check the product value is greater than or equal to zero
And user enter the pincode
And user click the view details
And user close the view_details page
Then user click the Add to cart Button
