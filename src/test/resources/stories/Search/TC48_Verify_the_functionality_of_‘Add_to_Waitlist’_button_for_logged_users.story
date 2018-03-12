Scenario: TC48_Verify_the_functionality_of_‘Add_to_Waitlist’_button_for_logged_users
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I hover at Top_Nav_Store_Mosaic and choose Category_link
And I search for soldout_size
And I Hover on product then click on soldout_size
And I click on Add_to_wait_list_button
Then Wait_List_Confirmation_Message should display