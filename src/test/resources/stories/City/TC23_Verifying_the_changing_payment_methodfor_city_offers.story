Scenario: TC23_Verifying_the_changing_payment_methodfor_city_offers
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
And I choose Other_Payment_Method
Then Offer should display