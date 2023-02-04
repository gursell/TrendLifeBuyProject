
Feature: US039 admin report visitor report tests / Administrator want a Visitor Report page to access reports of users visiting the site

  Scenario: TC_3901 Verify that the Visitor / Visitor Report List is visible

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link
    Then Admin clicks Visitor link
    Then Admin verifies that Visitor Report List is visible
    And Closes the page

  Scenario: TC_3902 Verify that it is possible to search the Visitor Report list with Quick Search TextBox

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link
    Then Admin clicks Visitor link
    Then Admin verifies that it is possible to search Visitor Report List with Quick Search TextBox
    And Closes the page

  Scenario: TC_3903 Verify that the IP, Agent, Device, Location, Date information are listed in the Visitor Report List

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link
    Then Admin clicks Visitor link
    Then Admin verifies that IP information is listed in the Visitor Report List
    Then Admin verifies that Agent information is listed in the Visitor Report List
    Then Admin verifies that Device information is listed in the Visitor Report List
    Then Admin verifies that Location information is listed in the Visitor Report List
    Then Admin verifies that Date information is listed in the Visitor Report List
    And Closes the page

  Scenario: TC_3904 It should be verified that it is possible to switch between the pages in the Visitor Report List

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link
    Then Admin clicks Visitor link
    Then Admin verifies that it is possible to switch between the pages in the Visitor Report List
    And Closes the page

  Scenario: TC_3905 Verify that there is a maximum of 10 keyword information on each page in the Visitor Report List

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link
    Then Admin clicks Visitor link
    Then Admin verifies that there is a maximum of 10 keyword information on each page in the Visitor Report List
    And Closes the page