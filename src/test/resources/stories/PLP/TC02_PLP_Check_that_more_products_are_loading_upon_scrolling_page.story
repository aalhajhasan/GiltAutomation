Scenario: TC02_PLP_Check_that_more_products_are_loading_upon_scrolling_page
Given I am on Featured page
When I navigate to any Gilt sale
And I Scroll down till end page
Then Additional products should be loaded