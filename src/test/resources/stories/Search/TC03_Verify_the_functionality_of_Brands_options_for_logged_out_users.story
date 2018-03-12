Scenario: TC03_Verify_the_functionality_of_Brands_options_for_logged_out_users
Given I am on Featured page
When I hover at Top_Nav_Store_Mosaic and choose Category_link
And I click on Brand_Tab
And I randomly click on the displayed Search_Brand
Then selected_Brand Should match with breadcrumb