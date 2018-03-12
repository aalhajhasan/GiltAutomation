Scenario: TC24_Check_the_functionality_of_Searching_for_specific_keyword
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I click on Top_Nav_Search_Section
And I fill Top_Nav_Search_Section:searching_keyword
And I click on Top_Nav_Search_Icon
Then search_result_page should display