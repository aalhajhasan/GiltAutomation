Scenario: TC12_ PLP_Functionality_of_“Add to Waitlist”_button_logged_out_users
Given I am on Featured page
When I navigate to any Gilt sale
And I search for soldout_size
And I Hover on product then click on soldout_size
And I click on Add_to_wait_list_button
Then Register_Dialog should display