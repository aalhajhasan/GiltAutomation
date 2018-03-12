Scenario: TC05_Verify_the_functionality_of_searching_for_Brands_in_Brands_Filter
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I hover at Top_Nav_Store_Mosaic and choose Category_link
And I click on Brand_Tab
And I fill Brand_Search_Box:Search_keyword
And I randomly click on the displayed Search_Brand
Then selected_Brand Should match with breadcrumb