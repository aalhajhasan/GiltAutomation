Scenario: TC02_Verify_the_functionality_of_category_options_for_logged_users
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I hover at Top_Nav_Store_Mosaic and choose Category_link
And I randomly click on the displayed Search_Category
Then selected_Category Should match with breadcrumb