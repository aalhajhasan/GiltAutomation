Scenario:  TC03_Check_the_functionality_of_submitting_city_orders_for_existing_users
Given I am on Featured page
When I click on city
And I navigate to any City live offer
And I search to find ODP_Buy_Now_button
And I click on ODP_Buy_Now_button
And I click on sign_in_link
And I fill Login_Email:valid_email_address
And I fill Login_Password:valid_Password
And I click on Login_sign_in_Button
And I click on Submit_Your_Order_Button
And I cancel order
Then Orders_Receipt_page should display