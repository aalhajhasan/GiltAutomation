Scenario: TC15_Verify_that_Breadcrumbs_is_displaying_on_search_results_pages_for_logged_out_users
Given I am on Featured page
When I hover at Top_Nav_Store_Mosaic and choose Category_link
And I randomly click on the displayed Search_Category
Then Breadcrumbs should display