Scenario: TC05_Verify_the_functionality_for_‘See_All_XXX_Brands’_link
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I click on Top_Nav_Account_Icon
And I click on AccountDDL_your_profile_link
And I click on See_All_Brands
Then All_Followed_Brands should display