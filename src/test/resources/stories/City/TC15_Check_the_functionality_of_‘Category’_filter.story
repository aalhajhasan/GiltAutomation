Scenario: TC15_Check_the_functionality_of_‘Category’_filter
Given I am on Featured page
When I click on city
And I click on City_Selector
And I Select los_angeles
And I click on Category_Selection
And I click randomly on Category
Then Offers should be filtered depends on selected Category