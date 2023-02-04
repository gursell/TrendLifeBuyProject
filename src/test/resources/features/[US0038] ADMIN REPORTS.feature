
Feature: US038 admin-report keyword-search tests / Administrator can see reports about keywords used on the site

  Scenario: TC_3801 Verify that it is possible to search the Keyword search report list with Quick Search TextBox

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link
    Then Admin clicks Keywords Search link
    Then Admin verifies that the Keyword Search List can be searched with Quick Search TextBox
    And Closes the page

  Scenario: TC_3802 It should be verified that there is a Keyword search report List on the Admin Reports / Keywords Search page

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link
    Then Admin clicks Keywords Search link
    Then Admin verifies that there is a Keyword search report List in the Admin Reports - Keywords Search page
    And Closes the page

  Scenario: TC_3803 It should be verified that Keyword and Number of Time are included in the Keyword search report List

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link
    Then Admin clicks Keywords Search link
    Then Admin verifies that Keywords is included in the Search Report List
    Then Admin verifies that Number of Time is included in the Search Report List
    And Closes the page

  Scenario: TC_3804 It should be verified that it is possible to switch between the pages in the Keyword search report List

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link
    Then Admin clicks Keywords Search link
    Then Admin verifies that it is possible to switch between the pages in the Keyword Search Report List
    And Closes the page

  Scenario: TC_3805 It should be verified that there is a maximum of 10 keyword information on each page in the Keyword search report list

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link
    Then Admin clicks Keywords Search link
    Then Admin verifies that there is a maximum of 10 keyword information on each page in Keyword search report list
    And Closes the page