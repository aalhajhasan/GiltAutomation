Scenario: TC20_Check _the_redirection_of_'city’s name'_link_within_Breadcrumb_section
Given I am on Featured page
When I click on city
And I click on City_Selector
And I Select Washington_DC
And I search about collection_offer
And I click on City_name_link
Then I should be redirected to City mosaic page