Scenario: TC20_Check_the_redirection_of_Account_Credits_Page_from_account_DDL
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I click on Top_Nav_Account_Icon
And I click on AccountDDL_Account_settings_link
And I click on Account_Credits_link
Then Account_Credits_page should display
