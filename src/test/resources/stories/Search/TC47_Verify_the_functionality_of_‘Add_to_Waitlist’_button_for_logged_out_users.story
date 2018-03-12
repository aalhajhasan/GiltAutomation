Scenario: TC47_Verify_the_functionality_of_‘Add_to_Waitlist’_button_for_logged_out_users
Given I am on Featured page
When I hover at Top_Nav_Store_Mosaic and choose Category_link
And I search for soldout_size
And I Hover on product then click on soldout_size
And I click on Add_to_wait_list_button
Then Register_Dialog should display