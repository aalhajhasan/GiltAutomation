Scenario: TC45_Verify_the_functionality_of_�Buy_Now�_button_for_logged_out_users
Given I am on Featured page
When I hover at Top_Nav_Store_Mosaic and choose Category_link
And I search for available_size
And I Hover on product then click on available_size
And I click on Buy_Now_button
Then register_page should display