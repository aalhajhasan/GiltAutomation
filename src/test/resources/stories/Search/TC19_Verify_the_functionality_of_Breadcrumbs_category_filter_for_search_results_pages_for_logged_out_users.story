Scenario: TC19_Verify_the_functionality_of_Breadcrumbs_category_filter_for_search_results_pages_for_logged_out_users
Given I am on Featured page
When I hover at Top_Nav_Store_Mosaic and choose Category_link
And I randomly click on the displayed Search_Category
Then selected_Category Should match with breadcrumb