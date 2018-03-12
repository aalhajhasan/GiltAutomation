Scenario: TC16_ PLP_Functionality_of_Quick_View_link
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I navigate to any Gilt sale
And I search for QV_link
And I Hover on product then click on QV_link
Then QV_Dialog should display