Scenario:  TC06_Check_the_functionality_of_“Add to Waitlist”_button_for_Soldout_offers_for_logged_out_users
Given I am on Featured page
When I click on city
And I navigate to any City live offer
And I search to find ODP_Addtowaitlist_Button
And I click on ODP_Addtowaitlist_Button
Then Register_Dialog should display