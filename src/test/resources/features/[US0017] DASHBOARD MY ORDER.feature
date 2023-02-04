


Feature: US_0017 My Order page visibility test on Dashboard page

  Scenario: TC_1701 Verification of My Order page

    Given Open browser go to url "userUrl"
    Then  User clicks on the login link, enters "nesemail" and "password" and logs in
    Then  User clicks on dashboard link
    Then  User clicks My Order section on dashbord page
    Then  User verifies that My Order page is accessible
    And  Closes the page



  Scenario: TC_1702 Filtering the orders on My Order page

    Given Open browser go to url "userUrl"
    Then  User clicks on the login link, enters "nesemail" and "password" and logs in
    Then  User clicks on dashboard link
    Then  User clicks My Order section on dashbord page
    Then  User verifies that My Order list can be filtered as All, To Pay, To Ship, To Received
    And  Closes the page



    Scenario: TC_1703 Filtering the orders on My Order page

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "nesemail" and "password" and logs in
      Then  User clicks on dashboard link
      Then  User clicks My Order section on dashbord page
      Then  User verifies that Order ID is displayed
      Then  User verifies that Status is displayed
      Then  User verifies that Order date is displayed
      Then  User verifies that Order Amount is displayed
      Then  User verifies that Paid By is displayed
      And  Closes the page



  Scenario: TC_1704 Verification of the number of products on the order page
    Given Open browser go to url "userUrl"
    Then  User clicks on the login link, enters "nesemail" and "password" and logs in
    Then  User clicks on dashboard link
    Then  User clicks My Order section on dashbord page
    Then  User verifies that all the options of the dropdown menu of the number of products can be determined
    Then Closes the page


  Scenario: TC_1705  Verification of transitions between pages (by prev-next) on the order page

    Given Open browser go to url "userUrl"
    Then  User clicks on the login link, enters "nesemail" and "password" and logs in
    Then  User clicks on dashboard link
    Then  User clicks My Order section on dashbord page
    Then  User goes to bottom of the page
    Then  User clicks next and or previous buttons
    And   Closes the page
