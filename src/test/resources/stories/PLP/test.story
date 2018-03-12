Scenario: test
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I navigate to any Gilt sale
And I search for available_size
And I Add 16 available_size from different product using Add_to_Cart button