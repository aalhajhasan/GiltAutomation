Scenario: TC14_Check_the_redirection_of_Payment_Methods_from_account_DDL
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I click on Top_Nav_Account_Icon
And I click on AccountDDL_Payment_Methods_link
Then Payment_Methods_page should display