Scenario: TC15_ PLP_Functionality_of_“Buy Now”_button_logged_users
Given I am on Featured page
When I click on Top_Nav_Register_link
And I Fill new email_address in reg_Email_Address
And I click on Shop_Now_button
And I Fill new number reg_password
And I click on Male_gender
And I click on reg_Submit_button
And I click on Start_Shopping_button
And I navigate to any Gilt sale
And I search for available_size
And I Hover on product then click on available_size
And I click on Buy_Now_button
Then Checkout_Nav should display