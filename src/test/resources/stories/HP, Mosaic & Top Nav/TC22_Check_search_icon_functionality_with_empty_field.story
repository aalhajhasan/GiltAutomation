Scenario: TC22_Check_search_icon_functionality_with_empty_field
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I click on Top_Nav_Search_Section
Then Top_Nav_Category_Suggestion should display