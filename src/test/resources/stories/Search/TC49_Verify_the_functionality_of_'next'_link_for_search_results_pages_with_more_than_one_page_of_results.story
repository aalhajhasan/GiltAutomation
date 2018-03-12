Scenario: TC49_Verify_the_functionality_of_'next'_link_for_search_results_pages_with_more_than_one_page_of_results
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I hover at Top_Nav_Store_Mosaic and choose Category_link
And I Scroll down
And I click on Next_Button
Then I should navigate to the next search page
