Scenario:  TC08_Check_the_functionality_of_‘View Your Waitlist’_link_within_Waitlist_Confirmation_dialog
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I click on city
And I navigate to any City live offer
And I search to find ODP_Addtowaitlist_Button
And I click on ODP_Addtowaitlist_Button
And I click on view_wait_list_link
Then Waitlist_page should display