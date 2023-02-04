
Feature: US037 recharge - offline - index tests / Administrator should be able to view balance changes made offline
  @SystemTest
  Scenario: TC_3701 Verify that the Offline Recharge List is available on the Offline Recharge page
    
    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Wallet Manage link
    Then Admin clicks Offline Recharge link
    Then Admin verifies that Offline Recharge List is displayed on the Offline Recharge Page
    And Closes the page

  Scenario: TC_3702 It should be verified that transactions are listed according to information in the Offline Recharge List

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Wallet Manage link
    Then Admin clicks Offline Recharge link
    Then Admin verifies that transactions are listed according to SL information in the Offline Recharge List
    Then Admin verifies that transactions are listed according to Date information in the Offline Recharge List
    Then Admin verifies that transactions are listed according to Email information in the Offline Recharge List
    Then Admin verifies that transactions are listed according to TXN ID information in the Offline Recharge List
    Then Admin verifies that transactions are listed according to Amount information in the Offline Recharge List
    Then Admin verifies that transactions are listed according to Type information in the Offline Recharge List
    Then Admin verifies that transactions are listed according to Payment Method information in the Offline Recharge List
    Then Admin verifies that transactions are listed according to Approval information in the Offline Recharge List
    Then Admin verifies that transactions are listed according to Action information in the Offline Recharge List
    And Closes the page

  Scenario: TC_3703 It should be verified that the transactions in the Offline Recharge List can be filtered according to information

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Wallet Manage link
    Then Admin clicks Offline Recharge link
    Then Admin verifies that transactions can be filtered according to SL information
    Then Admin verifies that transactions can be filtered according to Date information
    Then Admin verifies that transactions can be filtered according to TXN ID information
    Then Admin verifies that transactions can be filtered according to Amount information
    Then Admin verifies that transactions can be filtered according to Type information
    Then Admin verifies that transactions can be filtered according to Payment Method information
    Then Admin verifies that transactions can be filtered according to Approval information
    Then Admin verifies that transactions can be filtered according to Action information
    Then Admin verifies that transactions can be filtered according to Email information
    And Closes the page

  Scenario: TC_3704 Verify that it is possible to search the Offline Recharge Transaction List with the Quick Search TextBox

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Wallet Manage link
    Then Admin clicks Offline Recharge link
    Then Admin verifies that the Offline Recharge Transaction List can be searched with the Quick Search TextBox
    And Closes the page

  Scenario: TC_3705 It should be verified that balance can be changed offline with the Offline Recharge button

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Wallet Manage link
    Then Admin clicks Offline Recharge link
    Then Admin verifies that the balance can be changed offline with the Offline Recharge button
    And Closes the page
