Scenario:  TC05_Check_the_displaying_of_“Add to Waitlist”_button_for_Soldout_offers
Given I am on Featured page
When I click on city
And I navigate to any City live offer
And I search to find ODP_Addtowaitlist_Button
Then ODP_Addtowaitlist_Button should display