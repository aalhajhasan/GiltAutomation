Scenario: TC07_Check_search_functionality_under_(Discover_&_Search_More_Brands)_section
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I click on Top_Nav_Account_Icon
And I click on AccountDDL_your_profile_link
And I click on Brand_Search
And I Input into Brand_Search_input
And I randomly click on the displayed Search_autosuggest
Then Search_Brand_Result_Section should display