Scenario: TC22_PLP_Check_the displaying_of_Reserved_badge_for_product's_selected
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I navigate to any Gilt sale
And I search for Inventory_flag
And I Hover on 1left_Inventory_product then click on available_size
And I click on Add_to_Cart
And I click on Cart_Close_Button
Then Total_Inventory should be change