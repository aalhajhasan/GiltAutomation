Scenario: TC08_PLP_Functionality_of_'Following' button_logged_user
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I navigate to any Gilt sale
And I search for Following_button
And I Hover over Following_button then click on Following_button
Then Follow_text should display