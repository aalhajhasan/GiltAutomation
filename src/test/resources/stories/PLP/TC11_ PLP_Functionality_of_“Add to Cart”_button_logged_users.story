Scenario: TC11_PLP_Functionality_of_�Add to Cart�_button_logged_users
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I navigate to any Gilt sale
And I search for available_size
And I Hover on product then click on available_size
And I click on Add_to_Cart
Then cart_dialog should display