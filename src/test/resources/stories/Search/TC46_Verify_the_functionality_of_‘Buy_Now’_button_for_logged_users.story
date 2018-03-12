Scenario: TC46_Verify_the_functionality_of_‘Buy_Now’_button_for_logged_users
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I hover at Top_Nav_Store_Mosaic and choose Category_link
And I search for available_size
And I Hover on product then click on available_size
And I click on Buy_Now_button
Then Checkout_Nav should display