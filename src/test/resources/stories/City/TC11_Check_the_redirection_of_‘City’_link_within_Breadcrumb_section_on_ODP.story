Scenario: TC11_Check_the_redirection_of_‘City’_link_within_Breadcrumb_section_on_ODP
Given I am on Featured page
When I click on city
And I navigate to any City live offer
And I search to find City_link
And I click on City_link
Then City_mosaic should display