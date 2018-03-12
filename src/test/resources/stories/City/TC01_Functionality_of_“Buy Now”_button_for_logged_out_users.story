Scenario:  TC01_Functionality_of_“Buy Now”_button_for_logged_out_users
Given I am on Featured page
When I click on city
And I navigate to any City live offer
And I search to find ODP_Buy_Now_button
And I click on ODP_Buy_Now_button
Then register_page should display
