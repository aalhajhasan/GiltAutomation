Scenario: TC10_ PLP_Functionality_of_“Add to Cart”_button_logged_out_users
Given I am on Featured page
When I navigate to any Gilt sale
And I search for available_size
And I Hover on product then click on available_size
And I click on Add_to_Cart
Then cart_dialog should display