


Feature: US040 support ticket - my ticket tests / Administrator want a page to open a support ticket

  Scenario: TC_4001 Verify that the my ticket link directs to the relevant page

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks My Ticket link
    Then Admin verifies that My Ticket link directs to the relevant page
    And Closes the page

  Scenario: TC_4002 Verify that Select One, Installation, Technical, Others options are visible and selectable

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks My Ticket link
    Then Admin verifies that Select One is selectable from the Category Tab in the My Ticket Page
    Then Admin verifies that Installation is selectable from the Category Tab in the My Ticket Page
    Then Admin verifies that Technical is selectable from the Category Tab in the My Ticket Page
    Then Admin verifies that Others is selectable from the Category Tab in the My Ticket Page
    And Closes the page

  Scenario: TC_4003 Verify that Select One, High, Medium, Low options are visible and selectable

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks My Ticket link
    Then Admin verifies that High is selectable from the Priority Tab in the My Ticket Page
    Then Admin verifies that Medium is selectable from the Priority Tab in the My Ticket Page
    Then Admin verifies that Low is selectable from the Priority Tab in the My Ticket Page
    And Closes the page

  Scenario: TC_4004 Verify that Select One, Pending, On Going, Completed, Closed options are visible and selectable

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks My Ticket link
    Then Admin verifies that Select One is selectable from the Status Tab in the My Ticket Page
    Then Admin verifies that Pending is selectable from the Status Tab in the My Ticket Page
    Then Admin verifies that On Going is selectable from the Status Tab in the My Ticket Page
    Then Admin verifies that Completed is selectable from the Status Tab in the My Ticket Page
    Then Admin verifies that Closed is selectable from the Status Tab in the My Ticket Page
    And Closes the page

  Scenario: TC_4005 Verify that the Ticket List is created according to the filtering made from the Category, Priority and Status tabs

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks My Ticket link
    Then Admin verifies Ticket List can be created according to the filtering made from Category tab
    Then Admin verifies Ticket List can be created according to the filtering made from Priority tab
    Then Admin verifies Ticket List can be created according to the filtering made from Status tab
    And Closes the page

  Scenario: TC_4006 Verify that the Tickets are listed under the headings Subject, Category, User Name, priority, User Agent, Status, Action

    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminfatihmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks My Ticket link
    Then Admin verifies that the Tickets can be listed under the Subject heading
    Then Admin verifies that the Tickets can be listed under the Category heading
    Then Admin verifies that the Tickets can be listed under the User Name heading
    Then Admin verifies that the Tickets can be listed under the Priority heading
    Then Admin verifies that the Tickets can be listed under the User Agent heading
    Then Admin verifies that the Tickets can be listed under the Status heading
    Then Admin verifies that the Tickets can be listed under the Action heading
    And Closes the page