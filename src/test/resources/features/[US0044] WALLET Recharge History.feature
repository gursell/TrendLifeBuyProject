
Feature: US044 Admin Report - Wallet Recharge History tests / Administrator want a page to see reports of wallet activity

  Scenario: TC_4401 Verify that Wallet Recharge transactions are shown in the Wallet Recharge History List

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link
    Then Admin clicks Wallet Recharge History link
    Then Admin verifies that Wallet Recharge transactions are shown in Wallet Recharge History List
    And Closes the page

  Scenario: TC_4402 Verify that transactions are listed under User, Email, Type, Amount, Payment Details, TRX ID, Date

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link
    Then Admin clicks Wallet Recharge History link
    Then Admin verifies that transactions are listed under User information
    Then Admin verifies that transactions are listed under Email information
    Then Admin verifies that transactions are listed under Type information
    Then Admin verifies that transactions are listed under Amount information
    Then Admin verifies that transactions are listed under Payment Details information
    Then Admin verifies that transactions are listed under TRX ID information
    Then Admin verifies that transactions are listed under Date information
    And Closes the page

  Scenario: TC_4402 Verify that transactions are listed under User, Email, Type, Amount, Payment Details, TRX ID, Date

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link
    Then Admin clicks Wallet Recharge History link
    Then Admin verifies that there are transitions between pages
    And Closes the page