@SystemTest
Feature: US_0042 Testing to check the stock status of the products on the site

  Scenario: TC_4201 Verification of  the Type  on product stock

    Given Open browser go to url "adminUrl".
    Then  Admin enters an "adminnesemail", a "password", then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports section from sidebar menu on dashboard page
    Then Admin clicks Product stock section
    Then Admin verifies that Type can be selected
    Then Closes the page


  Scenario: TC_4202 Verification of Select One or All Product List

    Given Open browser go to url "adminUrl"
    Then  Admin enters an "adminnesemail", a "password", then clicks sign in link on admin page to login
    Then  Admin clicks Admin Reports section from sidebar menu on dashboard page
    Then  Admin clicks Product stock section
    Then  Admin clicks Type dropdown menu
    Then  Admin verifies that Select One is selectable
    Then  Admin verifies that All Product List is selectable
    And   Closes the page



  Scenario: TC_4203 Verification of the stock list of the selected products when the Type is selected

    Given Open browser go to url "adminUrl"
    Then  Admin enters an "neseAdminEmail", a "neseadminPassword", then clicks sign in link on admin page to login
    Then  Admin clicks Admin Reports section from sidebar menu on dashboard page
    Then  Admin clicks Product stock section
    Then  Admin clicks Type dropdown menu
    Then  Admin clicks Select One
    Then  Admin clicks Search button
     # Then  Admin verifies that the stock list of the selected products is displayed
    Then  Admin clicks All Product List button
    Then Admin clicks Search button again
     # Then  Admin verifies that the stock list of the selected products is displayed
    And   Closes the page
