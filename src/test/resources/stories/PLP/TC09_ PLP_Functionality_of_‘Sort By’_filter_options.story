Scenario: TC09_ PLP_Functionality_of_‘Sort By’_filter_options
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I navigate to any Gilt sale
And I select price_asc_option from sort_by
Then PLP_item_Price should be changed