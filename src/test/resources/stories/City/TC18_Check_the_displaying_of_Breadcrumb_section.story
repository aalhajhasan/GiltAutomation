Scenario: TC18_Check_the_displaying_of_Breadcrumb_section
Given I am on Featured page
When I click on city
And I click on City_Selector
And I Select Washington_DC
And I search about collection_offer
Then Breadcrumb_section should display