Scenario: TC17_ PLP_Quick_View_Functionality_of_‘View More Details’_link
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I navigate to any Gilt sale
And I search for any_size
And I Hover on product then click on QV_link
And I click on View_More_Details_link
Then I Should be redirected to PDP