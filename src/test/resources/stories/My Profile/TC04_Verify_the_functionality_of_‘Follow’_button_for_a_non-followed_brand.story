Scenario: TC04_Verify_the_functionality_of_‘Follow’_button_for_a_non-followed_brand
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I click on Top_Nav_Account_Icon
And I click on AccountDDL_your_profile_link
And I randomly click on the displayed Follow_Brands
Then Similar_Brands_Panal should display