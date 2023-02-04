

Feature: US_0016 Purchase History visibility test on Dashboard page

  Scenario: TC_1601 Verification of the Purchase History page

    Given Open browser go to url "userUrl"
    Then  User clicks on the login link, enters "nesemail" and "password" and logs in
    Then  User clicks on dashboard link
    Then User clicks Purchase History section on dashbord page
    Then User verifies that Purchase History page is accessible
    Then Closes the page


  Scenario: TC_1602 Verification of All History dropdown menu on Purchase History page

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "nesemail" and "password" and logs in
    Then User clicks on dashboard link
    Then User clicks Purchase History section on dashbord page
    Then User clicks All History dropdown menu on Purchase History page
    Then User verifies All History option on All History dropdown menu is displayed
    Then User verifies Pending Orders option on All History dropdown menu is displayed
    Then User verifies Confirmed Orders option on All History dropdown menu is displayed
    Then User verifies Completed Orders option on All History dropdown menu is displayed
    Then User verifies Refused Cancelled Orders option on All History dropdown menu is displayed
    And Closes the page


  Scenario: TC_1603 Verification the order summaries and the order invoice from
  the Actions column in the Purchase History list on the Purchase History page.

    Given Open browser go to url "userUrl"
    Then   User clicks on the login link, enters "nesemail" and "password" and logs in
    Then  User clicks on dashboard link
    Then  User clicks Purchase History section on dashbord page
    Then  User clicks the buttons in the action column of any order to see the order summary or to download order invoice
    And Closes the page