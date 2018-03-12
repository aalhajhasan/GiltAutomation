Scenario: TC14_Check_the_functionality_of_‘Neighborhood’_filter
Given I am on Featured page
When I click on city
And I click on City_Selector
And I Select los_angeles
And I click on Neighbourhood_Selection
And I click randomly on Neighbourhood
Then Offers should be filtered depends on selected Neighbourhood