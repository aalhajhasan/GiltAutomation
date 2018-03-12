Scenario: TC18_ PLP_Quick_View_Functionality_of_“Add to Cart”_button
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I navigate to any Gilt sale
And I search for available_size
And I Hover on product then click on QV_link
And I click on QV_Available_Size
And I click on QV_Add_to_Cart_button
Then QV-Added-Item_to_Cart_Message should display