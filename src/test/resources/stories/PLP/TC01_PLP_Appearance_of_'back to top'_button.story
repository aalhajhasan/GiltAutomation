Scenario: TC01_PLP_Appearance_of_'back to top'_button
Given I am on Featured page
When I navigate to any Gilt sale
And I scroll page down
Then back_to_top_button should display