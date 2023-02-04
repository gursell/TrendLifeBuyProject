
  Feature: US0045 As an administrator, I would like to have a Top Customer page to access reports on the most active customers on the site.
@SystemSecond
    Scenario: [TC_4501] It should be verified that the Top Customers List can be accessed from the Top Customers link

      Given Open browser go to "adminUrl"
      Then Admin enters an "adminleventmail", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks Admin reports Link on the dashboard
      Then Admin clicks Top Customers link under Admin reports Tab
      Then Admin verifies that the Top Customers List can be accessed from the Top Customers link
      And Closes the page

    @SystemSecond
    Scenario: [TC_4502] Verify that the top customers are listed under Name, Email, Phone, Total Spend, Joined AT in the Top Customers List

      Given Open browser go to "adminUrl"
      Then Admin enters an "adminleventmail", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks Admin reports Link on the dashboard
      Then Admin clicks Top Customers link under Admin reports Tab
      Then Admin verifies that the top customers are listed under Name, Email, Phone, Total Spend, Joined AT in the Top Customers List
      And Closes the page


    Scenario: [TC_4503] It should be verified that it is possible to search in the Top Customers List from the Quick Search TextBox

      Given Open browser go to "adminUrl"
      Then Admin enters an "adminleventmail", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks Admin reports Link on the dashboard
      Then Admin clicks Top Customers link under Admin reports Tab
      Then Admin clicks Quick Search TextBox and searches a customer by name
      Then Admin verifies that it is possible to search in the Top Customers List from the Quick Search TextBox
      And Closes the page


    Scenario: [TC_4504] Verify that there are transitions between pages in the Top Customers List

      Given Open browser go to "adminUrl"
      Then Admin enters an "adminleventmail", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks Admin reports Link on the dashboard
      Then Admin clicks Top Customers link under Admin reports Tab
      Then Admin clicks (next page arrow)
      Then Admin verifies that there are transitions between pages in the Top Customers List
      And Closes the page
