Scenario: TC04_Check_the_functionality_of_submitting_city_orders_for_new_registered_users
Given I am on Featured page
When I click on city
And I navigate to any City live offer
And I search to find ODP_Buy_Now_button
And I click on ODP_Buy_Now_button
And I Fill new email_address in reg_Email_Address
And I click on Shop_Now_button
And I Fill new number reg_password
And I click on Male_gender
And I click on reg_Submit_button
And I fill First_Name:validname
And I fill Last_Name:validlastname
And I fill Card_Number:validcardnumber
And I select 12 from Month
And I select 2031 from Year
And I fill Security_Code:validSecurityCode
And I fill Street_Address:validStreetAddress
And I fill Checkout_City:validcity
And I select Florida from State
And I fill Postal_code:validPostalcode
And I click on reg_Save&Continue_button
And I click on Submit_Your_Order_Button
And I cancel order
Then Orders_Receipt_page should display