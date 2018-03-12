Scenario: TC27_Verify_the_functionality_of_Breadcrumbs_Maximum_‘Price_Range’_filter_for_search_results_pages_for_logged_out_users
Given I am on Featured page
When I hover at Top_Nav_Store_Mosaic and choose Category_link
And I click on Price_Range_Tab
And I fill random number in Price_Max_Value
Then Filled_Price Should match with breadcrumb