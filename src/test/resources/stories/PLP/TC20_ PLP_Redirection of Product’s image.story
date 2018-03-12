Scenario: TC20_ PLP_Redirection of Product’s image
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I navigate to any Gilt sale
And I search for any_size
And I navigate to any Gilt PDP
Then I should navigate to currect PDP