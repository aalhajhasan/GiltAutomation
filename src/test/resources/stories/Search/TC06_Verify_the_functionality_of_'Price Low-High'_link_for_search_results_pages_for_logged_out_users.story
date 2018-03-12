Scenario: TC06_Verify_the_functionality_of_'Price Low-High'_link_for_search_results_pages_for_logged_out_users
Given I am on Featured page
When I hover at Top_Nav_Store_Mosaic and choose Category_link
And I click on Search_Sort_by
And I click on Search_Price_Low-High
Then Search_item_Price should be changed