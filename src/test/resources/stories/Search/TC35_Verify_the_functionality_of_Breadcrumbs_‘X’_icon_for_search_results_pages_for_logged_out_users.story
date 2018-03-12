Scenario: TC35_Verify_the_functionality_of_Breadcrumbs_‘X’_icon_for_search_results_pages_for_logged_out_users
Given I am on Featured page
When I hover at Top_Nav_Store_Mosaic and choose Category_link
And I click on Breadcrumbs_X_Link
Then total_result should change