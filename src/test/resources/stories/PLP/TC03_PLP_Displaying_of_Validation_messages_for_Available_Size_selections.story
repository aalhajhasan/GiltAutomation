Scenario: TC03_PLP_Displaying_of_Validation_messages_for_Available_Size_selections
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I navigate to any Gilt sale
And I search for any_size
And I Hover on product then click on QV_link
And I click on QV_Buy_Now_button
Then QV_Size_Validation_message should display