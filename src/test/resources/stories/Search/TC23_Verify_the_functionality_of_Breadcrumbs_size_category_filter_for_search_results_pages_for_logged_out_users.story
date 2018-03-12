Scenario: TC23_Verify_the_functionality_of_Breadcrumbs_size_category_filter_for_search_results_pages_for_logged_out_users
Given I am on Featured page
When I hover at Top_Nav_Store_Mosaic and choose Category_link
And I click on Sizes_Tab
And I randomly click on the displayed Search_Size
Then selected_Size Should match with breadcrumb