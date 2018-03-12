Scenario: TC26_Check_the_functionality_of_continue_shopping_link
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I click on city
And I navigate to any City live offer
And I search to find ODP_Buy_Now_button
And I click on ODP_Buy_Now_button
And I click on checkout_remove_button
And I click on checkout_continue_shopping
Then Gilt_Logo should display