
Feature: US0049 As an administrator, I want a page to be able to perform operations regarding the categories that users will choose when opening a ticket.
  @SmokeSecond
  Scenario: [TC_4901] It should be verified that the Categories page can be accessed from the Category link.

    Given Open browser go to "adminUrl"
    Then Admin enters an "adminleventmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket Link on the dashboard
    Then Admin clicks Category link under Support Ticket Tab
    Then Admin verifies that the Categories page can be accessed from the Category link.
    And Closes the page

  @SmokeSecond
  Scenario: [TC_4902] It should be verified that a new category can be created for the Tickets by entering the name and status from the Add new section on the Categories page.

    Given Open browser go to "adminUrl"
    Then Admin enters an "adminleventmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket Link on the dashboard
    Then Admin clicks Category link under Support Ticket Tab
    Then Admin enters a category name at (add New) section, clicks to Save button and verifies that a new category can be created
    And Closes the page

  @SmokeSecond
  Scenario: [TC_4903] It should be verified that the ticket categories are displayed according to Name, Status, Action titles in the Category List.

    Given Open browser go to "adminUrl"
    Then Admin enters an "adminleventmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket Link on the dashboard
    Then Admin clicks Category link under Support Ticket Tab
    Then Admin verifies that the ticket categories are displayed according to Name, Status, Action titles in the Category List.
    And Closes the page

  @SmokeSecond
  Scenario: [TC_4904] It should be verified that the status of the categories can be changed under the Status title in the Category List.

    Given Open browser go to "adminUrl"
    Then Admin enters an "adminleventmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket Link on the dashboard
    Then Admin clicks Category link under Support Ticket Tab
    Then Admin clicks a categoriy’s status to make it inactive
    Then Admin verifies that the status of the categories can be changed
    And Closes the page


  Scenario: [TC_4905] It should be verified that there are edit and delete links in the select tab under the Action title in the Category List.

    Given Open browser go to "adminUrl"
    Then Admin enters an "adminleventmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket Link on the dashboard
    Then Admin clicks Category link under Support Ticket Tab
    Then Admin clicks a categoriy’s Select Button and sees the Edit Button and Delete Button
    Then Admin verifies that there are edit and delete links in the select tab under the Action title in the Category List.
    And Closes the page


  Scenario: [TC_4906] Verify that the edit page is opened when the edit link is clicked on the select tab under the Action title in the Category List.

    Given Open browser go to "adminUrl"
    Then Admin enters an "adminleventmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket Link on the dashboard
    Then Admin clicks Category link under Support Ticket Tab
    Then Admin clicks a categoriy’s Select Button and sees the Edit Button and Delete Button
    Then Admin clicks the edit link
    Then Admin verifies that the edit page is opened when the edit link is clicked on the select tab under the Action title in the Category List.
    And Closes the page


  Scenario: [TC_4907] It should be verified that the Name and Status of the category can be updated on the Edit page that opens when the edit link is clicked on the select tab under the Action title in the Category List.

    Given Open browser go to "adminUrl"
    Then Admin enters an "adminleventmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket Link on the dashboard
    Then Admin clicks Category link under Support Ticket Tab
    Then Admin clicks a categoriy’s Select Button and sees the Edit Button and Delete Button
    Then Admin clicks the edit link
    Then Admin changes the name and the status of the category and verifies that the Name and Status of the category can be updated
    And Closes the page


  Scenario: [TC_4908] It should be verified that the category can be deleted on the delete page that opens when the delete link is clicked on the select tab under the Action title in the Category List.

    Given Open browser go to "adminUrl"
    Then Admin enters an "adminleventmail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Support Ticket Link on the dashboard
    Then Admin clicks Category link under Support Ticket Tab
    Then Admin clicks a categoriy’s Select Button and sees the Edit Button and Delete Button
    Then Admin clicks the delete link and verifies that the category can be deleted
    And Closes the page
