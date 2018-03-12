Scenario: TC07_PLP_Functionality_of_'Follow'_button_logged_user
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I navigate to any Gilt sale
And I search for Follow_button
And I Hover over Follow_button then click on Follow_button
Then Unfollow_text should display