
  Feature:US0023 DASHBOARD_SUPPORT TICKET

    Scenario: TC_2301 Verify that the Support Ticket page is accessible.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
    Then User clicks on dashboard link
    Then User clicks Support Ticket on dashboard page
    Then User verifies that the page is accessibleS
    And  Closes the page

      Scenario:TC_2302 Verify that the All Submitted Ticket List is visible on the Spport Ticket page.

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "nevzatmail" and "password" and logs in
      Then  User clicks on dashboard link
      Then  User clicks Support Ticket on dashboard page
      Then  User verifies that the All Submitted Ticket text is visible
      And   Closes the page

      Scenario: TC_2303

      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
      Then User clicks on dashboard link
      Then User clicks Support Ticket on dashboard page
      Then User verifies name sequences of All Sent Ticket line text
      And  Closes the page

      Scenario: TC_2304

      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
      Then User clicks on dashboard link
      Then User clicks Support Ticket on dashboard page
      Then User clicks view button on Support Ticket page
      Then User verifies that data is visible
      And  Closes the page

      Scenario: TC_2305

      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
      Then User clicks on dashboard link
      Then User clicks Support Ticket on dashboard page
      Then User clicks view button on Support Ticket page
      Then User verifies that Status, Priority, and Category information is visible
      And  Closes the page

      Scenario: TC_2306

      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
      Then User clicks on dashboard link
      Then User clicks Support Ticket on dashboard page
      Then User clicks view button on Support Ticket page
      Then User verifies that the answer is visible
      And  Closes the page

      Scenario: TC_2307

      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
      Then User clicks on dashboard link
      Then User clicks Support Ticket on dashboard page
      Then User clicks view button on Support Ticket page
      Then User verifies that the Reply button visible
      And  Closes the page

      Scenario: TC_2308

      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
      Then User clicks on dashboard link
      Then User clicks Support Ticket on dashboard page
      Then User verifies that All Ticket dropdown section is filterable
      And  Closes the page

      Scenario: TC_2309

      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
      Then User clicks on dashboard link
      Then User clicks Support Ticket on dashboard page
      Then User clicks Add New Button on Support Ticket page
      Then User verifies that redirect to Create New Ticket page
      And Closes the page

      Scenario: TC_2310

      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
      Then User clicks on dashboard link
      Then User clicks Support Ticket on dashboard page
      Then User clicks Add New Button on Support Ticket page
      Then User enters information  "Subject" "Category" "Priority" and "Description"
      Then User verifies that the information are enterable on Create New Ticket page
      And  Closes the page


