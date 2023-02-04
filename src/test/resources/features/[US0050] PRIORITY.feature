
Feature: US050 As an administrator, I want a page to be able to perform operations related to
  the priorities that users will choose when opening a ticket.
  @SystemSecond
  Scenario: TC_5001 Verify that the Priority link leads to the Priority page

    Given Open browser go to "adminUrl"
    Then Admin enters an "admingurselmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks on Priority link
    Then Admin verifies if the Priority link leads to Priority page
    And Admin closes "adminUrl"
@SystemSecond
  Scenario: TC_5002 It should be verified that a new Priority can be created for
  Tickets by entering the name and status from the Add new section on the Priority page.

    Given Open browser go to "adminUrl"
    Then Admin enters an "admingurselmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks on Priority link
    Then Admin clicks on Add New Box and enters a name
    Then Admin verifies if a new Priority can be seen under the Priority List
    And Admin closes "adminUrl"

  Scenario: TC_5003 It should be verified that a new Priority can be created for
  Tickets by entering the name and status from the Add new section on the Priority page.

    Given Open browser go to "adminUrl"
    Then Admin enters an "admingurselmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks on Priority link
    Then Admin verifies if the Priorities are displayed according to Name,Status and Actions headings
    And Admin closes "adminUrl"

  Scenario: TC_5004 It should be verified that the status of the
  Priorities can be changed under the Status title in the Priority List.


    Given Open browser go to "adminUrl"
    Then Admin enters an "admingurselmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks on Priority link
    Then Admin verifies if the status of the Priorities can be changed under the Status title
    And Admin closes "adminUrl"

  Scenario: TC_5005 It should be verified that there are edit and delete links
  in the select tab under the Action title in the Priority List.


    Given Open browser go to "adminUrl"
    Then Admin enters an "admingurselmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks on Priority link
    Then Admin clicks on Select tab
    Then Admin verifies that there are Edit and Delete links in the select tab
    And Admin closes "adminUrl"

  Scenario: TC_5006 Verify that the edit page is opened when the edit link is clicked
  on the select tab under the Action title in the Priority List.


    Given Open browser go to "adminUrl"
    Then Admin enters an "admingurselmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks on Priority link
    Then Admin clicks on Select tab
    Then Admin clicks on Edit link
    Then Admin verifies that the edit page is opened after clicking Edit link
    And Admin closes "adminUrl"

  Scenario: TC_5007 It should be verified that the Name and Status of the category can be updated on the Edit
  page that opens when the edit link is clicked on the select tab under the Action title in the Category List.


    Given Open browser go to "adminUrl"
    Then Admin enters an "admingurselmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks on Priority link
    Then Admin clicks on Select tab
    Then Admin clicks on Edit link
    Then Admin verifies if the Name and Status of the category can be updated
    And Admin closes "adminUrl"

  Scenario: TC_5008 It should be verified that Priority can be deleted on the delete page
  that opens when the delete link is clicked on the select tab under the Action title in the Priority List.


    Given Open browser go to "adminUrl"
    Then Admin enters an "admingurselmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket link
    Then Admin clicks on Priority link
    Then Admin clicks on Select tab
    Then Admin clicks on Delete link
    Then Admin verifies if Priority can be deleted after clicking delete link on the select tab under the Action title
    And Admin closes "adminUrl"



