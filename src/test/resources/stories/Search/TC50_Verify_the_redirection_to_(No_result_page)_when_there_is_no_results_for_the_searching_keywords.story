Scenario: TC50_Verify_the_redirection_to_(No_result_page)_when_there_is_no_results_for_the_searching_keywords
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I type random text in Top_Nav_Search_Section
Then No_result_page should display