Scenario: TC12_Check_the_redirection_of_Returns_and_exchange_from_account_DDL
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I click on Top_Nav_Account_Icon
And I click on AccountDDL_Return_&_exchanges_link
Then Return_&_exchanges_page should display