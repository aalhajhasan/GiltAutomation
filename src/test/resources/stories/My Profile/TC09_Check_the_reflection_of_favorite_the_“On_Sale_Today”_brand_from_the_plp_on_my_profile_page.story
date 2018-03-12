Scenario: TC09_Check_the_reflection_of_favorite_the_“On_Sale_Today”_brand_from_the_plp_on_my_profile_page
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I click on Top_Nav_Account_Icon
And I click on AccountDDL_your_profile_link
And I randomly click on the displayed Brands
Then search_result_page should display