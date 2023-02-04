
Feature:US_0025 As a user, I want to be able to logout from the site after completing my shopping on the site.

  Scenario: US_2501 Verify that the Logout link is visible on the home page.
    Given Open browser go to url "userUrl"
    Then  User clicks on the login link, enters "eminemail" and "password" and logs in
    Then  Verifies that the users Logout link is displayed on the home page.
    And   Closes the page

  Scenario: US_2502 When you click on the Logout link on the main page, it should be verified that the account has been logged out.
    Given Open browser go to url "userUrl"
    Then  User clicks on the login link, enters "eminemail" and "password" and logs in
    Then User clicks on the Logout link.
    Then It is displayed on the account that the user is logged out of.
    And Closes the page
  @SmokeTest
  Scenario: US_2503 Verify that there is a Logout link in the Dashboard Side Bar.
    Given Open browser go to url "userUrl"
    Then  User clicks on the login link, enters "eminemail" and "password" and logs in
    Then User clicks on dashboard link
    Then The visibility of the Sign Out link in the Dashboard Sidebar is verified.
    And Closes the page

  Scenario: US_2504 When the Logout link in the Dashboard Side Bar is clicked, it should be verified that the account is logged out.
    Given Open browser go to url "userUrl"
    Then  User clicks on the login link, enters "eminemail" and "password" and logs in
    Then User clicks on dashboard link
    Then User clicks  Logout link in the Dashboard Side Bar.
    Then It displayed verified that the account is logged out.
    And Closes the page

