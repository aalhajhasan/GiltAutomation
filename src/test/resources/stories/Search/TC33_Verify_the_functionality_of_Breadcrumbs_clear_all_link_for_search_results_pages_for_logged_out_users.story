Scenario: TC33_Verify_the_functionality_of_Breadcrumbs_clear_all_link_for_search_results_pages_for_logged_out_users
Given I am on Featured page
When I hover at Top_Nav_Store_Mosaic and choose Category_link
And I click on Search_Clear_All_link
Then total_result should change