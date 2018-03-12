Scenario: TC13_Verify_the_functionality_of_Maximum_and_Minimum_’Price_Range’_filter_for_search_results_pages_for_logged_out_users
Given I am on Featured page
When I hover at Top_Nav_Store_Mosaic and choose Category_link
And I click on Search_Sort_by
And I click on Search_Price_Low-High
And I click on Price_Range_Tab
And Price_Min_Value should match Search_item_Pric
And I click on Search_Sort_by
And I click on Search_Price_High-Low
And Price_Max_Value should match Search_item_Pric
Then Minimum and Maximum Values should be matched