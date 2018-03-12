Scenario: TC21_Verifying_submitting_offers_with_Discover_as_a_payment
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I click on city
And I navigate to any City live offer
And I search to find ODP_Buy_Now_button
And I click on ODP_Buy_Now_button
And I click on Change_Payment_Method
And I click on Add_a_new_Payment_Method_link
And I fill Card_Number:Discover_Card
And I select 12 from Month
And I select 2031 from Year
And I fill Security_Code:validSecurityCode
And I click on reg_Save&Continue_button
And I click on Submit_Your_Order_Button
And I cancel order
Then Orders_Receipt_page should display