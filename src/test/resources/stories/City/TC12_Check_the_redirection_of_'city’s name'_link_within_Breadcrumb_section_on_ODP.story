Scenario: TC12_Check_the_redirection_of_'city’s name'_link_within_Breadcrumb_section_on_ODP
Given I am on Featured page
When I click on city
And I navigate to any City live offer
And I search to find City_name_link
And I click on City_name_link
Then I should be redirected to that City mosaic page