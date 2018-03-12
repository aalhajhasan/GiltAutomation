Scenario: TC19_Check_the_redirection_of_‘City’_link_within_Breadcrumb_section
Given I am on Featured page
When I click on city
And I click on City_Selector
And I Select Washington_DC
And I search about collection_offer
And I click on City_link
Then City_mosaic should display