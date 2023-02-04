
Feature: [US0053] ADMIN ACTIVITY LOGS PAGE
  @SmokeSecond
  Scenario:[TC_5301] It should be verified that the activities are listed under the headings Type, Description, Url, IP, Agent, Attempted AT, User in the Activity Logs List.

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminnevzatmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Activity Logs section on Dashboard page
    Then Admin verifies that titles and subreddits are linked
    Then Closes the page

  Scenario:[TC_5302] Verify that there are transitions between pages in the Activity Logs List
    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminnevzatmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Activity Logs section on Dashboard page
    Then Admin verifies function of page switch button
    And  Closes the page
  Scenario:[TC_5303] It should be verified that the activities in the Activity Logs list can be cleared / deleted with the Celan All button.

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminnevzatmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Activity Logs section on Dashboard page
    Then Admin clicks Clean Button on the Activity Logs page, Admin verifies that the page is clean
    And  Closes the page