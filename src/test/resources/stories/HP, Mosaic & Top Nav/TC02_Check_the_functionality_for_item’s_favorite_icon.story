Scenario: TC02_Check_the_functionality_for_item’s_favorite_icon
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I click on foryou_favorite_button
Then favorited_item should display