Scenario: TC01_Verify_the_functionality_of_category_options_for_logged_out_users
Given I am on Featured page
When I hover at Top_Nav_Store_Mosaic and choose Category_link
And I randomly click on the displayed Search_Category
Then selected_Category Should match with breadcrumb