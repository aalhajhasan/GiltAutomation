Scenario: TC06_Verify_the_functionality_of_store’s_tab_links_on_(Discover_&_Search_More_Brands)
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I click on Top_Nav_Account_Icon
And I click on AccountDDL_your_profile_link
And I randomly click on the displayed Store_tab
Then Recomended_Brands should display