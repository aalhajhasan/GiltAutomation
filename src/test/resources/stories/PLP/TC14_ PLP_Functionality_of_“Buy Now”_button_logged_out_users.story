Scenario: TC14_ PLP_Functionality_of_“Buy Now”_button_logged_out_users
Given I am on Featured page
When I navigate to any Gilt sale
And I search for available_size
And I Hover on product then click on available_size
And I click on Buy_Now_button
Then register_page should display