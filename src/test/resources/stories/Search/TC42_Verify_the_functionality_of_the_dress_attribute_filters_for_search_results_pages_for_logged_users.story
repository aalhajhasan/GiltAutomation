Scenario: TC42_Verify_the_functionality_of_the_dress_attribute_filters_for_search_results_pages_for_logged_users
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I hover at Top_Nav_Store_Mosaic and choose Dresses_Category
And I randomly click on the displayed Dress_Attribute
And I randomly click on the displayed Dress_Attribute
Then Opened_Dress_Attribute should display