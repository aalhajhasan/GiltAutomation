Scenario: TC24_Verifying_the_changing_of_MC_payment_method_to_another_payment
Given I am on Featured page
When I click on Top_Nav_Sign_In_link
And I fill Email_Address:valid_email_address
And I fill Password:valid_Password
And I click on sign_in_submit_button
And I navigate to URL Mastercard_Offer
And I click on Mastercard_button
And I click on Change_Payment_Method
And I click on Add_a_new_Payment_Method_link
And I fill Card_Number:Visa_Card
And I select 12 from Month
And I select 2031 from Year
And I fill Security_Code:Visa_Code
And I click on reg_Save&Continue_button
Then MC_Validation_Message should display